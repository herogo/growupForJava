package com.jd.x.classLoader;

public class Test {

    public static void main(String[] args) {
        try {
            Class<?> forName = Class.forName("java.lang.String");
            System.out.println("启动类加载器bootstrap:"+forName.getClassLoader());

            Class<?> forName2 = Class.forName("com.jd.x.classLoader.A");
            System.out.println("应用类加载器:"+forName2.getClassLoader());
        }catch (Exception exception){
            exception.printStackTrace();
        }


    }
}



class A{}
