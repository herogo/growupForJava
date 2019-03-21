package com.jd.x.actor;

import akka.actor.AbstractActor;

/**
 * Created by kongpeiling on 2019/1/29 10:04.
 */
public class YourActor extends AbstractActor {

    @Override
    public Receive createReceive() {
        Receive match = receiveBuilder().match(String.class, d -> {
            System.out.println("hello");
        }).build();

        System.out.println("hello, i am youractor!");
        return match;
    }
}
