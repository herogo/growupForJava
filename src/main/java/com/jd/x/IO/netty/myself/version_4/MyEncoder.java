package com.jd.x.IO.netty.myself.version_4;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by kongpeiling on 2018/12/21 15:32.
 */
public class MyEncoder extends MessageToByteEncoder <String>{
    @Override
    protected void encode(ChannelHandlerContext ctx, String msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.getBytes());
    }
}
