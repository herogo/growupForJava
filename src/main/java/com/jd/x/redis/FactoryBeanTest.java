package com.jd.x.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.FactoryBean;

import javax.annotation.PostConstruct;

/**
 * Created by kongpeiling on 2019/3/20 16:53.
 */
public class FactoryBeanTest implements FactoryBean<RedissonDemo> {

    private String host="127.0.0.1";
    private String port="6379";
    private String pass="";
    private  RedissonClient redissonClient;
    public RedissonClient getRedissonClient() {
        return redissonClient;
    }
    FactoryBeanTest(){
        Config config = new Config();
        // config.useClusterServers() //这是用的集群server
//           config.useSingleServer() //单节点方式
//           config.useMasterSlaveServers()//主从复制
//           config.useSentinelServers()//哨兵模式

        //指定使用单节点部署方式 redisson3.5之后
        config.useSingleServer().setAddress("redis://"+host + ":" + port).setClientName("kpl");
        redissonClient = Redisson.create(config);
    }
    @Override
    public RedissonDemo getObject() throws Exception {
        return new RedissonDemo(redissonClient);
    }
    @Override
    public Class<?> getObjectType() {
        return RedissonDemo.class;
    }
    @Override
    public boolean isSingleton() {
        return true;
    }
}
