package com.xiaoqiang.sychronized;

public class DisapperRequest1 implements  Runnable {
    static int k=0;
    static DisapperRequest1 disapperRequest1=new DisapperRequest1();
    @Override
    public void run() {
       for(int i=0;i<100000;i++)
       {
           k++;
           System.out.println(i+Thread.currentThread().getName()+k);
       }
    }

    public static void main(String[] args) throws InterruptedException {
          Thread thread=new Thread(disapperRequest1);
          Thread thread1=new Thread(disapperRequest1);
          thread.start();
          thread1.start();
          thread.join();
          thread1.join();
          System.out.println(k);
    }


}
