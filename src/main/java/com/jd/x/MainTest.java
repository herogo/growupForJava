package com.jd.x;

import static java.lang.System.*;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2020/6/1
 * Time: 4:03
 * Description: com.jd.x
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {
    public static void main(String[] args) {
//        System.out.println(fib(10));
//        System.out.println(locateString("abcdefghijkghikkijjghikssgghi","ghi"));

         int n=16;
         int sum =0,i=0;
         double diff=0 ;//最后一个盒子该放的数量
         double temp=0;
         while(true){
             if(sum <= n){
                  temp = Math.pow(2,i);
                  sum +=Math.pow(2,i);
                 i++;
             }else {
                 diff = n-(sum-temp);
                 break;
             }
         }
        out.println(diff);

    }

    static private int locateString( String var1,String var2){

        int i=0,j=0,k=0;
        char[] chars1 = var1.toCharArray();
        char[] chars2 = var2.toCharArray();
        while(i<=chars1.length-chars2.length){
            if(chars1[i] == chars2[j] ){
                i++;
                j++;
               if(j==chars2.length){
                   k++;
                   j=0;
               }
            }else {
                i=i-j+1;
                j=0;
            }
        }
         return k;
    }

    static  private int fib(int n){
        int result =0;
        if(n==0){
            result =0;
        }else if(n==1){
            result =1;
        }else {
            result = fib(n-1)+fib(n-2);
        }
        return result;
    }



}
