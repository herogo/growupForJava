package com.jd.x.IO.mina;

import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

/**
 * Created by kongpeiling on 2018/12/18 18:05.
 */
public class MyMinaClientFilter extends IoFilterAdapter {
    @Override
    public void exceptionCaught(NextFilter nextFilter, IoSession session, Throwable cause) throws Exception {
        System.out.println("客户端：过滤器连接异常");
    }

    @Override
    public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
        System.out.println("客户端：过滤器messageReceived");
        nextFilter.messageReceived(session,message);
    }

    @Override
    public void messageSent(NextFilter nextFilter, IoSession session, WriteRequest writeRequest) throws Exception {
        System.out.println("客户端：过滤器messageSent");
        nextFilter.messageSent(session,writeRequest);
    }
}
