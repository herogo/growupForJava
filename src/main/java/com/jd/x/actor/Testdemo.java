package com.jd.x.actor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * Created by kongpeiling on 2019/1/29 10:07.
 */
public class Testdemo {

    public static void main(String[] args) {
            ActorRef myactor = ActorManger.createActor(MyActor.class);

            ActorRef youractor = ActorManger.createActor(YourActor.class);

            myactor.tell("hello actor's world",youractor);

        new ActorManger.CreateAgvActionActor(1);
        new  ActorManger.CreateAgvActionActor(2).staticAct();

    }
}
