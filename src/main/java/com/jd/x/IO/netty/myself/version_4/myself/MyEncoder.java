package com.jd.x.IO.netty.myself.version_4.myself;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageEncoder;
import org.msgpack.MessagePack;

import java.util.List;

/**
 * Created by kongpeiling on 2018/12/20 11:32.
 *
 * Myencoder
 * 编码器
 *
 */
public class MyEncoder extends MessageToByteEncoder<Object> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
       MessagePack mp = new MessagePack();
        byte[] write = mp.write(msg);
        out.writeBytes(write);


    }

}
