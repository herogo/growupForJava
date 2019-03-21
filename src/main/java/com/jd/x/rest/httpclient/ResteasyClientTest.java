package com.jd.x.rest.httpclient;

import com.jd.waps.dto.sorting.SortPocketStatusResponse;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kongpeiling on 2019/1/21 14:16.
 */
public class ResteasyClientTest {

    private  static String URLPATH ="http://localhost:8080/api/map";

    @Test
    public void test(){
        Map map=new HashMap();
        map.put("id","500");
        ResteasyClientUtils<SortPocketStatusResponse> client = new ResteasyClientUtils();
        SortPocketStatusResponse response = client.get(map, URLPATH, SortPocketStatusResponse.class);
        System.out.println(response.toString());


    }
}
