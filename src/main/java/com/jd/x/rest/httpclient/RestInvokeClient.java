package com.jd.x.rest.httpclient;

import com.google.gson.*;
import org.apache.http.HttpStatus;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.Type;
import java.util.Date;

public class RestInvokeClient<T> {

    private T handleHttpStatus(Response response, Class<T> classOfT, ResteasyClient client) {
        T t = null;
        if (response.getStatus() == HttpStatus.SC_OK) {
            String res = response.readEntity(String.class);
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                @Override
                public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return new Date(jsonElement.getAsJsonPrimitive().getAsLong());
                }
            });
            Gson gson = builder.create();
            t = gson.fromJson(res, classOfT);
        }
        response.close();
        client.close();
        return t;
    }

    public T sendPostMethod(Object param, String url, Class<T> classOfT) {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(url);
        Response response = target.request().post(Entity.entity(param, MediaType.APPLICATION_JSON_TYPE));
        return handleHttpStatus(response, classOfT, client);
    }

    public T sendGetMethod(String url, Class<T> classOfT) {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(url);
        Response response = target.request().get();
        return handleHttpStatus(response, classOfT, client);
    }
}
