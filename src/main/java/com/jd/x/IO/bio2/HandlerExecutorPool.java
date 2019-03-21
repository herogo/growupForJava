package com.jd.x.IO.bio2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * Created by kongpeiling on 2018/12/12 16:11.
 */
/**
 *
 * 自定义线程池
 * */
public class HandlerExecutorPool {

	private ExecutorService executor;
	public HandlerExecutorPool(int maxPoolSize, int queueSize){
		System.out.println("每次都new线程池吗？**************************************************************");
		this.executor = new ThreadPoolExecutor(
				Runtime.getRuntime().availableProcessors(),//获得可用的处理器个数
				maxPoolSize,                                 //最大线程数 线程池容量
				120L,                           //线程空闲等待时间120ms  如果有任务执行任务，如果无任务则回收该线程
				TimeUnit.SECONDS,                            //  等待单位时间  毫秒
				new ArrayBlockingQueue<Runnable>(queueSize));//有界队列   存放有任务未处理的线程
	}
	public void execute(Runnable task){
		this.executor.execute(task);
	}
	
	
	
}
