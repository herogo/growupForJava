package com.jd.x.IO.nio.self;

import javax.xml.soap.SOAPPart;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by kongpeiling on 2018/12/17 18:51.
 */
public class SelfServer {
    private final int SPACE=1024;
    private ByteBuffer senderBuffer = ByteBuffer.allocate(SPACE);//发送缓存区
    private ByteBuffer receiveBuffer = ByteBuffer.allocate(SPACE);//接受缓存区
    private Selector selector;

    public SelfServer( int port) throws IOException {
        ServerSocketChannel socketChannel = ServerSocketChannel.open();//打开通道

        socketChannel.configureBlocking(false);//设置通道非阻塞

        socketChannel.bind(new InetSocketAddress(port));//绑定端口

        selector = Selector.open();//打开选择器

        socketChannel.register(selector, SelectionKey.OP_ACCEPT);//将通道注册到选择器中，监听端口号

        System.out.println("Serve start ....+开始监听端口号为："+port);

    }

    //监听方法
    public void listen() throws IOException {
       while(true){
           //监听注册中心
           selector.select();
           Set<SelectionKey> selectionKeys = selector.selectedKeys();

           Iterator<SelectionKey> iterator = selectionKeys.iterator();//遍历selectionKeys 轮询

           while(iterator.hasNext()){
               SelectionKey selectionKey = iterator.next();//获取selectionKey
               iterator.remove();//从集合中删除此selectionKey
               handlerKey(selectionKey);
           }
           System.out.println(selectionKeys);

       }

    }

    public void handlerKey(SelectionKey selectionKey) throws IOException {
        ServerSocketChannel server = null;// 服务端对象
        SocketChannel client = null;//客户端对象

        String receInfo;//接受信息
        String sendInfo;//发送信息

        //以下是一个 流程 先接收客户端对象  然后读取客户端对象接收客户端信息  然后发送回客户端
        if(selectionKey.isAcceptable()){
            //如果接收事件 就代表服务端可以接收客户端信息
            //第一步：获得服务端对象
            server  = (ServerSocketChannel) selectionKey.channel();

            //第二步：从服务端对象 获得一个客户端对象
             client = server.accept();//获取客户端对象

            //设置客户端对象  为非阻塞
            client.configureBlocking(false);

            //客户端对象注册一个读就绪事件 ，等待连接...
            client.register(selector,selectionKey.OP_READ);

        }else if (selectionKey.isReadable()){//读就绪事件

            client = (SocketChannel) selectionKey.channel();

            int count = client.read(receiveBuffer);
            if(count >0 ){
                receInfo = new String(receiveBuffer.array(),0,count);
                System.out.println("服务端接收到客户端的信息........"+receInfo);
                client.register(selector,selectionKey.OP_WRITE);
            }
        }else if(selectionKey.isWritable()){ //写事件
            senderBuffer.clear();//清空缓存区
            client = (SocketChannel) selectionKey.channel();
            //发送的数据
            sendInfo = "服务端发送信息回客户端....";
            senderBuffer.put(sendInfo.getBytes());//发送到缓存区
            senderBuffer.flip();
            client.write(senderBuffer);
            System.out.println(sendInfo);
        }

    }

    public static void main(String[] args) throws IOException {
        SelfServer selfServer = new SelfServer(7700);
        selfServer.listen();
    }
}
