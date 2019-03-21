package com.jd.x.IO.nio.self;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * Created by kongpeiling on 2018/12/17 18:50.
 */
public class SelfClient {
    private static final int SPACE=1024;
    private  static ByteBuffer senderBuffer = ByteBuffer.allocate(SPACE);//发送缓存区

    //创建连接的地址
   private final static InetSocketAddress address = new InetSocketAddress("127.0.0.1", 7700);

    public static void main(String[] args) throws IOException {

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(address);

        while(true){
            //定义一个字节数组，然后使用系统录入功能：
            byte[] bytes = new byte[512];
            System.in.read(bytes);
            //把数据放到缓冲区中
            senderBuffer.put(bytes);
            //对缓冲区进行复位
            senderBuffer.flip();
            //写出数据
            socketChannel.write(senderBuffer);
            //清空缓冲区数据
            senderBuffer.clear();
        }


    }

}
