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
import java.util.concurrent.TimeUnit;

/**
 * Created by kongpeiling on 2019/1/21 13:32.
 */
public class ResteasyClientUtils<T> {
    /*
    * ResteasyClient：JAX-RS 2.0介绍了一种新的client API，涉及主要3个类：Client , WebTarget 和Response
    * Client： org.jboss.resteasy.client.jaxrs.ResteasyClient； new ResteasyClientBuilder().build();创建ResteasyClient实例
    * WebTarget： 通过client.target(); 得到
    * Response：   target.request.get()/post()
    *
    * */


    /*
    * 静态代码块 初始化 网络静态参数
    * */
    static  ResteasyClient client = null;

    static {
        ResteasyClientBuilder resteasyClientBuilder = new ResteasyClientBuilder();
        resteasyClientBuilder.socketTimeout(5000, TimeUnit.MILLISECONDS);  //获取数据的超时时间
        resteasyClientBuilder.connectionPoolSize(100); //连接池大小
        resteasyClientBuilder.connectionCheckoutTimeout(5000,TimeUnit.MILLISECONDS);//最大等待连接时间
        resteasyClientBuilder.maxPooledPerRoute(100);//每个客户端最大并行连接
        client = resteasyClientBuilder.build();
    }

    public T post(Object param, String url, Class<T> clazz){

        ResteasyWebTarget target = client.target(url);
        Response response = target.request().post(Entity.entity(param, MediaType.APPLICATION_JSON_TYPE));

        T hanlder = hanlder(response, clazz);
        return hanlder;
    }

    public T get(Object param, String url, Class<T> clazz){
        ResteasyWebTarget target = client.target(url);
        Response response = target.request().get();
        T hanlder = hanlder(response, clazz);
        return  hanlder;
    }

    public T hanlder(Response response,Class<T> clazz){
        T t=null;
        if (response.getStatus() == HttpStatus.SC_OK) {
            String res = response.readEntity(String.class);
//            GsonBuilder builder = new GsonBuilder();
//            builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
//                @Override
//                public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
//                    return new Date(jsonElement.getAsJsonPrimitive().getAsLong());
//                }
//            });
//            Gson gson = builder.create();
            Gson gson =new Gson();
            t = gson.fromJson(res, clazz);
        }
        response.close();
        client.close();
        return  t;
    }




}
