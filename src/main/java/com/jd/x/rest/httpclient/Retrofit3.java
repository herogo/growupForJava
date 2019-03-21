package com.jd.x.rest.httpclient;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by kongpeiling on 2019/1/21 16:15.
 */
public class Retrofit3 {
    private static  int readTimeout = 15;
    private static  int writeTimeout = 15;
    private static  int connectTimeout = 15;

    public Retrofit initRetrofit(String url){
        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .readTimeout(readTimeout, TimeUnit.SECONDS)
                .writeTimeout(writeTimeout, TimeUnit.SECONDS)
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                //.addInterceptor(interceptor)
                .build();

        Retrofit mRetrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .client(mOkHttpClient)
                .build();
        return  mRetrofit;
    }

    public <T> T getClient(Class<T> t,String baseURL){
        return  initRetrofit(baseURL).create(t);
    }



}
