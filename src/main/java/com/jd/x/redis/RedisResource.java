package com.jd.x.redis;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * Created by kongpeiling on 2018/12/29 20:04.
 */
public class RedisResource {
    public static void main(String[] args) {
        TestClass myfactorybean = (TestClass)new ClassPathXmlApplicationContext("conf/producer.xml").getBean("myfactorybean");
        myfactorybean.out();
    }
}
