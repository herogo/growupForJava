package com.jd.x;

import org.json.JSONObject;

/**
 * Created by kongpeiling on 2019/3/11 10:01.
 * 计算阶乘
 */
public class Factorial {
    public static void main(String[] args) {

        int n = 100;//n为指定输入的整数
        double sum = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += fact(i);
            }
            System.out.println(sum);
        }
    }
    static double  fact(int n){
        double result = 1;
        for(int i = 1; i <=n ; i++){
            result *= i;
        }
        return result;
    }
}
