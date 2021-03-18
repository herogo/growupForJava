package com.jd.x.IO.netty.myself.version_4.myself;


import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.InputStreamReader;

/**
 * Created by kongpeiling on 2018/12/19 17:37.
 */
public class MyClient {
    public static void main(String[] args) throws Exception{
        new MyClient("localhost", 8080).run();
    }

    private final String host;
    private final int port;

    public MyClient(String host, int port){
        this.host = host;
        this.port = port;
    }

    public void run() throws Exception{
        EventLoopGroup group = new NioEventLoopGroup();
        //客户端只要一个线程组就可以
        try {
            Bootstrap bootstrap  = new Bootstrap()
                    .group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new MyClientInitializer());
            Channel channel = bootstrap.connect(host, port).sync().channel();
            for(Integer i=0;i<1000;i++){
                char[] dec=i.toString().toCharArray();
                BufferedReader in = new BufferedReader(new CharArrayReader(dec));
                channel.writeAndFlush(in.readLine() + "\r\n");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }

    }
}


