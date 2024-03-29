package com.jd.x.IO.netty.myself.version_4.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;

/**
 * Created by kongpeiling on 2018/12/20 14:38.
 */
public class UdpServer {
    public static void main(String[] args) {
        try {
            Bootstrap b = new Bootstrap();
            EventLoopGroup group = new NioEventLoopGroup();//udp服务端一个线程组就够

            b.group(group)
                    .channel(NioDatagramChannel.class)  // 这里注意是NioDatagramChannel 与TCP区别NioSocketChannel
                    .option(ChannelOption.SO_BROADCAST, true) //广播
                    .handler(new UdpServerHandler());
            b.bind(2555).sync().channel().closeFuture().await();//异步 等待
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class UdpServerHandler extends SimpleChannelInboundHandler<DatagramPacket> {
        @Override
        protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
            ByteBuf buf = packet.copy().content();
            byte[] req = new byte[buf.readableBytes()];
            buf.readBytes(req);
            String body = new String(req, "UTF-8");
            System.out.println(body);//打印收到的信息
            //向客户端发送消息
            String json = "来自服务端: 南无阿弥陀佛";
            // 由于数据报的数据是以字符数组传的形式存储的，所以传转数据
            byte[] bytes = json.getBytes("UTF-8");
            DatagramPacket data = new DatagramPacket(Unpooled.copiedBuffer(bytes), packet.sender());
            ctx.writeAndFlush(data);//向客户端发送消息
        }
    }

}
