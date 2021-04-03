package com.jd.x.DesignPattern;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);


    }
}

 class testThread extends Thread{

     @Override
     public void run() {
         System.out.println(Singleton.getSingleton());
     }
 }

/**
 * 单例
 */
class Singleton{
//饿汉
    private Singleton(){}
    private static final Singleton singleton = new Singleton();
    public static Singleton getSingleton() {
        return singleton;
    }
}

class Singleton2{
    //懒汉
    private Singleton2(){}
    private static  Singleton2 singleton =null;

    public static Singleton2 getSingleton() {

        if(singleton==null) {
            synchronized (Singleton2.class) {  //保证多线程 创建的也是单例
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}


