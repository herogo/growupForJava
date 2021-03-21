package com.jd.x.Algorithm.strToInt;

public class StrTransfer {
    public static void main(String[] args) {


        String test ="+001234";
        //Integer.parseInt(test);
        System.out.println(strToInt(test));

    }

    /**
     * 字符串转换成整数
     * @param str
     * @return
     */
    public static int strToInt(String str){
        int value =0;
        int index =0;
        boolean ret = true;
        if(str.charAt(0) == '-' ){
            index =1;
            ret =false;
        }
        if(str.charAt(0) == '+' ){
            index =1;
        }
        for(int i=index; i<str.length();i++){
            value = value * 10 + str.charAt(i) -'0';
        }
        if(!ret)
            value *=  -1;
        return value;
    }







}
