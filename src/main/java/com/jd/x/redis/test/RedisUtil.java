package com.jd.x.redis.test;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;

/**
 * Created by kongpeiling on 2019/3/22 15:54.
 */
public class RedisUtil {
    private RedissonClient redissonClient;
    public RedisUtil(RedissonClient redissonClient){
        this.redissonClient = redissonClient;
    }

    public  void lock(String lockname) throws InterruptedException
    {
        String key = lockname;
        RLock lock = redissonClient.getLock(key);
       //lock提供带timeout参数，timeout结束强制解锁，防止死锁
        lock.lock(60L, TimeUnit.SECONDS);
    }


    //根据name对进行上锁操作，redisson tryLock  根据第一个参数，一定时间内为获取到锁，则不再等待直接返回boolean。交给上层处理
    public  boolean tryLock(String lockname) throws InterruptedException
    {
            String key = lockname;
            RLock lock = redissonClient.getLock(key);
        boolean b = lock.tryLock(5L, 60L, TimeUnit.SECONDS);
        //tryLock，第一个参数是等待时间，5秒内获取不到锁，则直接返回。 第二个参数 60是60秒后强制释放  }

            return b;
    }


    public  void unlock(String lockname) {
        String key = lockname;
        RLock lock = redissonClient.getLock(key);
        lock.unlock();
        }


}
