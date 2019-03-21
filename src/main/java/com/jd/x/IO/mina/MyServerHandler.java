package com.jd.x.IO.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import java.util.Date;

/**
 * Created by kongpeiling on 2018/12/18 10:52.
 */
public class MyServerHandler extends IoHandlerAdapter {

    //创建session
    @Override
    public void sessionCreated(IoSession session) throws Exception {
        System.out.println("方法名sessionCreated:创建session");
    }

    //打开session
    @Override
    public void sessionOpened(IoSession session) throws Exception {
        System.out.println("方法名sessionOpened:打开session");
    }

    //关闭session
    @Override
    public void sessionClosed(IoSession session) throws Exception {
        System.out.println("方法名sessionClosed:关闭session");
    }

    //空闲
    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        System.out.println("方法名sessionIdle:空闲");
    }

    //exceptionCaught:连接出现异常 调用的方法
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        System.out.println("方法名exceptionCaught:连接异常");

    }

    //接收信息的方法
    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        String  str=message.toString();
        if(str.trim().equals("cancel")){
            session.close();
        }
        System.out.println("方法名messageReceived:接收信息"+str);
        Date date = new Date();
        session.write(date);

    }

    //发送信息的方法
    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
         System.out.println("方法名messageSent:发送信息");
    }
}
