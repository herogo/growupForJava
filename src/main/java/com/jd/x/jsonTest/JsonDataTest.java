package com.jd.x.jsonTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2019/12/13
 * Time: 17:39
 * Description: com.jd.x
 * To change this template use File | Settings | File Templates.
 */
public class JsonDataTest {

    public static void main(String[] args) {
        Acctpt acctpt = new Acctpt("123456","345678","中国","1234567-34567","昆山","10-01","整");
        List acceptList = new ArrayList();
        acceptList.add(acctpt);
        Dto dto =new Dto("AcceptLabel",JsonHelper.toJson(acceptList));
        JsonHelper.toJson(dto);//所发送内容


    }


}
