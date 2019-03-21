package com.jd.x.IO.netty.myself.version_4.Marshalling;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ServerHandler extends SimpleChannelInboundHandler {


	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("服务端Handler被激活...........");
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		Request request = (Request)msg;
		System.out.println("Server : " + request.getId() + ", " + request.getName() + ", " + request.getRequestMessage());
		Response response = new Response();
		response.setId(request.getId());
		response.setName("response" + request.getId());
		response.setResponseMessage("响应内容" + request.getId());
		ctx.writeAndFlush(response);//.addListener(ChannelFutureListener.CLOSE);
	}


	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		ctx.close();
	}

	
	
}
