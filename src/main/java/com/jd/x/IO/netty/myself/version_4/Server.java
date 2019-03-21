package com.jd.x.IO.netty.myself.version_4;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Created by kongpeiling on 2018/12/19 15:40.
 */
public class Server  {

    public static void main(String[] args) throws Exception {

        //建立两个线程组
        NioEventLoopGroup boss=new NioEventLoopGroup();
        NioEventLoopGroup work=new NioEventLoopGroup();

        try {
            //ServerBootstrap 创建一个辅助类Bootstrap，就是对我们的Server服务器进行一系列的配置
            ServerBootstrap sb = new ServerBootstrap();
            sb.group(boss, work)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast("myDecoder",new MyDecoder())
                                         .addLast("myHandler",new MyServerHandler())
                                         .addLast("myEncoder",new MyEncoder());
                        }
                    })
                    .channel(NioServerSocketChannel.class);
            System.out.println("Server 启动了");
            ChannelFuture channelFuture = sb.bind(7600).sync();
            channelFuture.channel().closeFuture().sync();
        }finally {
            work.shutdownGracefully();
            boss.shutdownGracefully();

            System.out.println("Server 关闭了");
        }

    }
}
