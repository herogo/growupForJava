package com.jd.x.IO.netty.myself.version_4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * Created by kongpeiling on 2018/12/19 15:42.
 */
public class MyServerHandler extends SimpleChannelInboundHandler {

    ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);//得到所有接入的通道

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception
    {
        String str = msg.toString();
        System.out.println(str);
        for(Channel channel:channels){
            channel.writeAndFlush(msg);
        }
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("新通道加入："+ctx.channel().remoteAddress());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        System.out.println("老通道离开："+ctx.channel().remoteAddress());
    }
}
