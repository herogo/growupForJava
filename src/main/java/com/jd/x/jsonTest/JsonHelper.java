package com.jd.x.jsonTest;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonHelper {

    private final static Logger logger = LoggerFactory.getLogger(JsonHelper.class);

    private static ObjectMapper mapper = new ObjectMapper();

    public static <T> T fromJson(String json, Class<T> responseType) {
        try {
            //允许对象空属性序列化
            JsonHelper.mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
            //允许
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
            return JsonHelper.mapper.readValue(json, responseType);
        } catch (Exception e) {
            JsonHelper.logger.error("反序列化JSON发生异常， 异常信息为：" + e.getMessage(), e);
        }

        return null;
    }

    public static <T> T jsonToArray(String json, Class<T> responseType) {
        try {
            return JsonHelper.mapper.readValue(json, responseType);
        } catch (Exception e) {
            JsonHelper.logger.error("反序列化JSON发生异常， 异常信息为：" + e.getMessage(), e);
        }

        return null;
    }

    public static String toJson(Object obj) {
        return JsonHelper.toJson(obj, false);
    }

    public static String toJson(Object object, boolean prettyPrint) {
        try {
            if(prettyPrint){
                mapper.enable(SerializationFeature.INDENT_OUTPUT);
            }
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            JsonHelper.logger.error("序列化JSON发生异常， 异常信息为：" + e.getMessage(), e);
        }
        return null;
    }

    public static String toJsonBR(Object obj) {
        String json =  JsonHelper.toJson(obj, false);
        if(json !=null ){
            json = json.replace("\n","").replace("\r","");
        }
        return json;
    }
}