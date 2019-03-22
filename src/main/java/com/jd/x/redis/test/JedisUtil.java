package com.jd.x.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Created by kongpeiling on 2019/3/22 18:17.
 */
public class JedisUtil {
    Jedis  jedis;
    public JedisUtil() {
        Jedis  jedis = new Jedis("localhost",6379);
        jedis.connect();
        this.jedis =jedis;
    }
    public void SetNx(String key,String name){
        jedis.setnx(key,name);
    }
    public void Del(String key){
        jedis.del(key);
    }


}
