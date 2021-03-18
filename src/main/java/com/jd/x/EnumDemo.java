package com.jd.x;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2019/11/8
 * Time: 10:00
 * Description: com.jd.x
 * To change this template use File | Settings | File Templates.
 */
public enum EnumDemo {
    SORT("zz","12"),
    SORT2("aa","123");
    private  String name;
    private String aage;
    EnumDemo(String name, String aage){
        this.aage=aage;
        this.name =name;
    }

    public String getName() {
        return name;
    }
    public String getAage(){
        return aage;
    }

    public static void main(String[] args) {
        //System.out.println(EnumDemo.SORT.getName()+"::"+EnumDemo.SORT2.getAage());
        String dec =null ;
        System.out.println();
    }
}
