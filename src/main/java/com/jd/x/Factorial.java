package com.jd.x;

import org.json.JSONObject;

/**
 * Created by kongpeiling on 2019/3/11 10:01.
 * 计算阶乘
 */
public class Factorial {
    public static void main(String[] args) {

//        int n=100;//n为指定输入的整数
//        double sum = 0;
//
//        if(n > 0){
//            for(int i = 1; i <=n ;i++){
//                sum += fact(i);
//            }
//            System.out.println(sum);
//        }


      JSONObject jsonObject= new JSONObject("{\"topic\":\"heartbeat\",\"orgNo\":\"6\",\"distributeNo\":\"6\",\"warehouseNo\":\"1\",\"areaId\":\"666\",\"forkliftNo\":\"1\",\"dataID\":\"20190312000000\",\"workState\":2,\"startNode\":24,\"endNode\":23,\"progress\":0,\"progressPer\":0,\"posX\":\"-34744.0\",\"posY\":\"742.0\",\"headTheta\":1,\"orgPosX\":\"1.234\",\"orgPosY\":\"-0.987\",\"headOrgTheta\":3140,\"buoyNum\":4,\"deviation\":-1,\"occupied\":1,\"forkPos\":0,\"event\":65535,\"charge\":100,\"speed\":1000,\"steerAngle\":1570,\"udpcount\":\"12832938\",\"sn\":null}");
        System.out.println("/////////////////////////"+jsonObject);

        }
    static double  fact(int n){
        double result = 1;
        for(int i = 1; i <=n ; i++){
            result *= i;
        }
        return result;
    }
}
