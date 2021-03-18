package com.jd.x.synchronized2;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2019/11/6
 * Time: 16:50
 * Description: com.jd.x.synchronized2
 * To change this template use File | Settings | File Templates.
 */
public class Count {
    final Object lock = new Object();
    public Count() {
        countValue =0;
    }
    private Integer countValue;

    public  int getCountValue() {
        return countValue;
    }
    public void setCountValue(int countValue) {
        this.countValue = countValue;
    }
    public Count(int countValue) {
        this.countValue = countValue;
    }
    public  void  increaseCount(){
           int count = countValue;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count +=1;
            System.out.println(countValue);
            countValue = count;
            synchronized(lock){
                lock.notifyAll();
            }
    }
}
