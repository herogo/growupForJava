package com.jd.x.actor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * Created by kongpeiling on 2019/1/29 9:44.
 */
public class ActorManger {

    static ActorSystem actorSystem =null;


    public static ActorRef createActor(Class clazz){

        actorSystem = ActorSystem.create("actorSystem");

        return  actorSystem.actorOf(Props.create(clazz),clazz.getName());
    }

    public static class CreateAgvActionActor{
    public void act(){
        System.out.println("静态内部类的非静态成员");
    }
    public  CreateAgvActionActor(int i){
        System.out.println("静态内部类构造方法"+i);
    }
    public static void staticAct(){
        System.out.println("静态内部类的静态成员");
    }
    }

}
