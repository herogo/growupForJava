package com.jd.x.redis;

import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RSet;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;

import java.util.Iterator;

/**
 * Created by kongpeiling on 2019/2/22 11:47.
 */
public class RmapTest {

    public static void main(String[] args) {
        Config config = new Config();
        SingleServerConfig singleServerConfig = config.useSingleServer();
        singleServerConfig.setAddress("redis://127.0.0.1:6379");
        //singleServerConfig.setPassword("9client!");

        RedissonClient redissonClient = Redisson.create(config);
//
//        RMap<String, Integer> map = redissonClient.getMap("myMap");
//
//
//        RSet<String> set =redissonClient.getSet("myset");
//        set.add("kpl");
//        set.add("wmm");
//        map.put("aaaa", 1234);
//        map.put("bbbb", 4321);
//        System.out.println(map.get("bbbb"));

        redissonClient.shutdown();
    }
}
