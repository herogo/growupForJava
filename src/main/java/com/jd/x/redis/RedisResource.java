package com.jd.x.redis;

import com.jd.x.redis.test.JedisUtil;
import com.jd.x.redis.test.RedisUtil;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Created by kongpeiling on 2018/12/29 20:04.
 */
public class RedisResource {


    public static void main(String[] args) {


        String key ="Test_only";
        FactoryBeanTest factoryBeanTestA = new FactoryBeanTest();
        RedissonClient redissonClienta = factoryBeanTestA.getRedissonClient();
        FactoryBeanTest factoryBeanTestB = new FactoryBeanTest();
        RedissonClient redissonClientb = factoryBeanTestB.getRedissonClient();

        RLock lock = redissonClienta.getLock(key);
        RLock lock1 = redissonClientb.getLock(key);
        lock.lock();
        lock1.unlock();


        }
//        JedisUtil jedisUtil = new JedisUtil();
//        jedisUtil.SetNx("kpl","lockname");



    public  static void testlock(RedissonClient redissonClient,String key)
    {
        try {
            new RedisUtil(redissonClient).lock(key);
            System.out.println("----------加锁时间为:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            System.out.println("----------当前线程为" + Thread.currentThread().getName());
            sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            new RedisUtil(redissonClient).unlock(key);
            System.out.println("----------释放锁时间为" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            System.out.println("----------当前线程为" + Thread.currentThread().getName());
        }
    }

    public  static void testtrylock(RedissonClient redissonClient, String key)
    {
        Boolean b=null;
        try {
           b = new RedisUtil(redissonClient).tryLock(key);
            if(!b){
                System.out.println("----------尝试获取不到锁--------"+"----------当前线程为" + Thread.currentThread().getName());
                return;
            }
            System.out.println("----------加锁时间为:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            System.out.println("----------当前线程为" + Thread.currentThread().getName());

            Thread.currentThread().sleep(6000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }finally
        {
            if(b) {
                new RedisUtil(redissonClient).unlock(key);
                System.out.println("----------释放锁时间为" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                System.out.println("----------当前线程为" + Thread.currentThread().getName());
            }
        }
    }

}
