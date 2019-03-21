package com.jd.x.IO.mina;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * Created by kongpeiling on 2018/12/18 10:43.
 */
public class MinaServer {

    private static IoAcceptor ioAcceptor = null; //IoAcceptor 继承IOService 描述服务端 ； IoConnector 继承IOService 描述客户端

    public static void main(String[] args) throws IOException {

        ioAcceptor = new NioSocketAcceptor();//多线程IoProcessor 用于执行真正的IO 操作，默认启用的线程个数是CPU 的核数+1，
                                            // 譬如：单CPU 双核的电脑，默认的IoProcessor 线程会创建3 个。
                                           // 这也就是说一个IoAcceptor 或者IoConnector 默认会关联一个IoProcessor 池，
        //  这个池中有3 个IoProcessor。因为IO 操作耗费资源，所以这里使用IoProcessor 池来完成数据的读写操作，有助于提高性能。
        // 这也就是前面说的IoAccetor、IoConnector 使用一个Selector，而IoProcessor 使用自己单独的Selector 的原因。
        // 那么为什么IoProcessor 池中的IoProcessor 数量只比CPU 的核数大1 呢？因为IO 读写操作是耗费CPU 的操作，
        // 而每一核CPU 同时只能运行一个线程，因此IoProcessor 池中的IoProcessor 的数量并不是越多越好。
        //这个IoProcessor 的数量可以调整，如下所示：
        //IoAcceptor acceptor=new NioSocketAcceptor(5);
        //IoConnector connector=new NioSocketConnector(5);
        //这样就会将IoProcessor 池中的数量变为5 个，也就是说可以同时处理5 个读写操作。

        //设置过滤器 自定义过滤器
        ioAcceptor.getFilterChain().addLast("codec",new ProtocolCodecFilter(
                new TextLineCodecFactory(
                        Charset.forName("utf-8"),
                        LineDelimiter.WINDOWS.getValue(),
                        LineDelimiter.WINDOWS.getValue()
                )));
        ioAcceptor.getFilterChain().addLast("myMinaServerFilter",new MyMinaServerFilter());
        ioAcceptor.getSessionConfig().setReadBufferSize(1024);
        ioAcceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE,5);
        ioAcceptor.setHandler(new MyServerHandler());//自定义处理方式
        ioAcceptor.bind(new InetSocketAddress(7700));
        System.out.println("Server Start --------->");


    }
}
