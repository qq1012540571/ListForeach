package com.xiaoqiang.sychronized;

public class SynchronizedClassStatic4 implements  Runnable {
    static  SynchronizedClassStatic4 instance1=new SynchronizedClassStatic4();
    static SynchronizedClassStatic4 instance2=new SynchronizedClassStatic4();
    @Override
    public void run() {
        method();
    }

    public static void main(String[] args) {
        Thread t1=new Thread(instance1);
        Thread t2=new Thread(instance2);
        t1.start();
        t2.start();
        while (t1.isAlive()||t2.isAlive())
        {

        }
        System.out.println("结束");
    }

    public  static synchronized  void method()
    {
        System.out.println(Thread.currentThread().getName()+"lock1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束1");
    }
}
