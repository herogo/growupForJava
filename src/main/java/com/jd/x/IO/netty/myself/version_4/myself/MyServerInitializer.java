package com.jd.x.IO.netty.myself.version_4.myself;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * Created by kongpeiling on 2018/12/19 16:55.
 *
 * 用来增加多个的处理类到 ChannelPipeline 上，包括编码、解码、Handler 等
 */
public class MyServerInitializer extends  ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast("framer", new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("encoder", new StringEncoder());
        pipeline.addLast("handler", new MyServerHandler());

        System.out.println("MyClient:"+ch.remoteAddress() +"连接上");
    }
}
