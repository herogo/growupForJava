package com.jd.x;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by kongpeiling on 2019/3/11 10:22.
 */
public class CyclicBarrierTest {
    private final int RUNNER_COUNT = 8;
    final CyclicBarrier barrier = new CyclicBarrier(RUNNER_COUNT);
    public void goHome() throws InterruptedException, BrokenBarrierException {
        System.out.println(Thread.currentThread().getName());
        barrier.await();
        System.out.println(Thread.currentThread().getName());//记录并打印到达顺序
    }
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        final CyclicBarrierTest instance = new CyclicBarrierTest();
        /**
         * 每个线程代表一个选手
         */
        for (int i = 0; i < instance.RUNNER_COUNT; i++) {
            new Thread("选手" + i + "  ") {
                public void run() {
                    try {
                        instance.goHome();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                };
            }.start();
        }
    }
}
