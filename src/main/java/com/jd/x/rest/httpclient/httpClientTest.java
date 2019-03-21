package com.jd.x.rest.httpclient;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kongpeiling on 2019/1/11 16:21.
 */
public class httpClientTest {



    @Test
    public void test() throws Exception{
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("username", "kongpeiling"));
        formparams.add(new BasicNameValuePair("password", ""));
        HttpEntity reqEntity = new UrlEncodedFormEntity(formparams, "utf-8");
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)//一、连接超时：connectionTimeout-->指的是连接一个url的连接等待时间
                .setSocketTimeout(5000)// 二、读取数据超时：SocketTimeout-->指的是连接上一个url，获取response的返回等待时间
                .setConnectionRequestTimeout(5000)
                .build();

        HttpClient client = new DefaultHttpClient();

        HttpResponse response = null;
        Map map=new HashMap();
        map.put("id","500");
        HttpUriRequest get = HttpClientUtils.getRequestMethod(map, "http://localhost:8080/api/map", "get");
        System.out.println("*********"+get);
        response = client.execute(get);
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));

//
//        //get请求
//        HttpResponse response = requestGet("http://localhost:8080/api/map/500",requestConfig,client);
//
//        if (response.getStatusLine().getStatusCode() == 200) {
//            HttpEntity resEntity = response.getEntity();
//            String message = EntityUtils.toString(resEntity, "utf-8");
//            System.out.println(message);
//        } else {
//            System.out.println("请求失败");
//        }
    }

    //get
    public  HttpResponse requestGet(String url,RequestConfig requestConfig,HttpClient client){
        HttpGet get = new HttpGet(url);
        get.setConfig(requestConfig);
        HttpResponse response = null;
        try {
             response = client.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    //post
    public  HttpResponse requestPost(String url,RequestConfig requestConfig,HttpClient client,HttpEntity reqEntity){
        HttpPost post = new HttpPost("http://ssa.jd.com/sso/login");
        post.setEntity(reqEntity);
        post.setConfig(requestConfig);
        HttpResponse response = null;
        try {
            response = client.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

}
