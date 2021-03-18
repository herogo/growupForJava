package com.jd.x.Algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2020/6/14
 * Time: 20:47
 * Description: com.jd.x.Algorithm.sort
 * To change this template use File | Settings | File Templates.
 */
public class StringExercise {
    public static void main(String[] args) {
        int i = 10;
        String str="1234";
        List list = new ArrayList();
        changI(i,str);
        changList(list);
        System.out.println(i);
        System.out.println(str);
        System.out.println(list);
    }

    private static void changList(List list) {
      list.add("test");
    }

    private static void changI(int i,String str) {
        i=20;
        str = "123456";
    }

    /**
     * 无重复的最长子串，暴力法
     */
    private  static void forceSearch(String var){
        for(int i=0;i<var.length();i++){
            for(int j=i;j<var.length();j++){
                String substring= var.substring(i,j);
                //判断有无重复
                boolean repeate = isRepeate(substring);
            }

            }
        }

    private static boolean isRepeate(String var){
        for(int i=0;i<var.length();i++){
            char c = var.charAt(i);
            for(int j=0;j<var.length();j++){
                if(c==var.charAt(j))
                    return true;
            }
        }
        return false;
    }

    }





