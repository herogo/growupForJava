package com.jd.x.IO.netty.myself.version_4.myself;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.MessageToMessageEncoder;
import org.msgpack.MessagePack;

import java.util.List;

/**
 * Created by kongpeiling on 2018/12/20 13:20.
 *
 * 解码器
 */
public class MyDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        final byte [] array;
        final int length =msg.readableBytes();
        array = new byte[length];
        msg.getBytes(msg.readerIndex(),array,0,length);
        MessagePack msgpack= new MessagePack();
        out.add(msgpack.read(array));  //反序列化为Object对象

    }
}
