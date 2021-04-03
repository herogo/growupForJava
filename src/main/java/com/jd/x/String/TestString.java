package com.jd.x.String;

public class TestString {
    public static void main(String[] args) {
        String s =new String("1");//首先常量池检查是否存在“1”  不存在创建 返回在堆中创建了一个对象new String("1")  s指向堆中这个对象
        String s2 =  "1";// 直接检查常量池 有就返回 s2 指向常量池这个对象
        System.out.println(s == s2); //false
        System.out.println("-----------------------------");

        String s3= new String("12")+new String("34");//s3是 堆对象（“1234”）的引用
        s3.intern();//在jdk1.7   重点把堆中（“1234”）对象的引用放在常量池中   jdk1.6中会在 常量池中在生成一个“1234”的对象
        String s4 = "1234";//指向中常量池中 指向堆对象的引用 即与s3同一个地址
        System.out.println(s3==s3.intern()); // true
        System.out.println(s3 == s4);//true
        System.out.println("-----------------------------");

        String s12 ="123456";//在常量池中建立“123456” 对象
        String s10= new String("123")+new String("456");//s3是 堆对象（“123456”）的引用
        s10.intern();//这时发现常量池中已经有了“123456”的对象 就把常量池中“123456”的引用返回    返回值即和s12指向一样
        String s11 = "123456";//指向常量池中  即与s12同一个地址
        System.out.println(s10==s10.intern()); // false
        System.out.println(s10 == s11);//false
        System.out.println(s10.intern() == s12);//true
        System.out.println(s10.intern() == s11);//true
        System.out.println(s12 == s11);//true

        System.out.println("-----------------------------");

        String s5= new String("2") + new String("2");
        s5.intern();
        String s6= "22";
        System.out.println(s5 == s6);
    }
}
