package com.jd.x.synchronized2;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2019/11/6
 * Time: 15:56
 * Description: com.jd.x.synchronized2
 * To change this template use File | Settings | File Templates.
 */
public class SynchronizedTest {
    final Object onlyLock = new Object();
    private static class task implements Runnable{
        Count myCount;
        int amount;
        task(Count count,int amount){
            this.myCount = count;
            this.amount = amount;
        }
        public  void run() {
            for(int i =1 ;i<=amount;i++){
                myCount.increaseCount();
            }
        }
    }

    public static void main(String[] args) {
        final Count c = new Count();
        Runnable r = new task(c,10);
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t.start();
        t2.start();
        t3.start();
        System.out.println(c.getCountValue());
    }
}
