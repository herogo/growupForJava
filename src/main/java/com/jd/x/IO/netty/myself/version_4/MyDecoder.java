package com.jd.x.IO.netty.myself.version_4;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * Created by kongpeiling on 2018/12/21 15:23.
 */
public class MyDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
       if(in.readableBytes()>=4) {
           int bytes = in.readableBytes();
           System.out.println(ctx.channel().remoteAddress() + "进站，解码器：" + bytes + "个字节");
           out.add(in);
       }
    }
}
