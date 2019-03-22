package com.jd.x.redis;

import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import retrofit2.http.Body;

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

    /**
     * 根据name对进行上锁操作，redisson Lock 一直等待获取锁
     * @param key
     * @return
     */
    public void lock(String key){

        //获取锁对象
        RLock lock = redissonClient.getLock(key);
        //加锁，并且设置锁过期时间，防止死锁的产生
        lock.lock(2, TimeUnit.SECONDS);

    }

    /**
     * 根据name对进行上锁操作，redisson tryLock  根据第一个参数，一定时间内为获取到锁，则不再等待直接返回boolean。交给上层处理
     * @param key
     * @return
     * @throws InterruptedException
     */
    public Boolean trylock(String key) throws InterruptedException {
        RLock lock = redissonClient.getLock(key);
        boolean b = lock.tryLock(2, 6, TimeUnit.SECONDS);
        return  b;

    }

    /**
     * 根据name对进行解锁操作
     */
    public void unlock(String key){
        RLock lock = redissonClient.getLock(key);
        lock.unlock();
    }

}
