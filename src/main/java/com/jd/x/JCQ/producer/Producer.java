package com.jd.x.JCQ.producer;

import com.jcloud.jcq.client.Exception.ClientException;
import com.jcloud.jcq.protocol.Message;
import com.jcloud.jcq.sdk.producer.model.SendResult;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kongpeiling on 2019/3/5 9:56.
 */
public class Producer {


    /**
     * topic名称
     */
    private static final String TOPIC = "warehouse-forklift-topic";

    public static void main(String[] args) throws ClientException {

        // 从context中获取生产者bean （对于生命周期由spring管理的对象，比如controller、service等, 要使用producer bean, 直接注入即可)
        com.jcloud.jcq.sdk.producer.Producer producer = (com.jcloud.jcq.sdk.producer.Producer) new ClassPathXmlApplicationContext("conf/producer.xml").getBean("producer");

        // 创建message
        Message message = new Message();
        message.setTopic(TOPIC);
        message.setBody(("this is test message").getBytes());
        // 同步发送单条消息
        SendResult sendResult = producer.sendMessage(message);
        System.out.println("*************************"+sendResult);
    }


}
