package com.jd.x.IO.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

import java.util.Date;

/**
 * Created by kongpeiling on 2018/12/18 13:50.
 */
public class MyClientHandler extends IoHandlerAdapter {
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        System.out.println("exceptionCaught:连接异常");
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        String string = message.toString();
        System.out.println("客户端获得数据......"+string);
        session.write(new Date());
    }
}

