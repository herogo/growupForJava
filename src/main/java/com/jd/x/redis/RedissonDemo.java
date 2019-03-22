package com.jd.x.redis;

import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by kongpeiling on 2019/3/21 15:10.
 */

public class RedissonDemo {

    private RedissonClient redissonClient;

    public RedissonDemo(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }
    public void getMap(String key1,String key2, HashMap hashMap){
        RMap<Object, Object> map = redissonClient.getMap(key1);
        map.put(key2, hashMap);
    }

    //redisson锁
    public void lock(String name){
        //获取锁对象
        RLock lock = redissonClient.getLock(name);

        //加锁，并且设置锁过期时间，防止死锁的产生
        lock.lock(5, TimeUnit.MILLISECONDS);

        //释放锁
        lock.unlock();

    }

}
