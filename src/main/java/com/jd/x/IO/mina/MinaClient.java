package com.jd.x.IO.mina;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketConnector;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kongpeiling on 2018/12/18 10:42.
 */
public class MinaClient {
    private static String host="127.0.0.1";
    private static int port = 7700;


    public static void main(String[] args) {
        IoConnector connector = new NioSocketConnector();//IoConnector 继承IOService 描述客户端  用户发起连接请求

        connector.setConnectTimeoutMillis(10000);
        //设置连接超时设置

        //设置过滤器  自定义过滤器
        connector.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(
                new TextLineCodecFactory(
                        Charset.forName("utf-8"),
                        LineDelimiter.WINDOWS.getValue(),
                        LineDelimiter.WINDOWS.getValue()
                )));

        //自定义过滤器
        connector.getFilterChain().addFirst("myClientFilter",new MyMinaClientFilter());
        connector.setHandler(new MyClientHandler());//自定义处理类

        ConnectFuture connectFuture = connector.connect(new InetSocketAddress(host, port));
        connectFuture.awaitUninterruptibly();//阻塞等待连接
        IoSession session = connectFuture.getSession();
        session.write("客户端写数据：你好！");
        session.getCloseFuture().awaitUninterruptibly();//等待关闭连接
        connector.dispose();

    }

}
