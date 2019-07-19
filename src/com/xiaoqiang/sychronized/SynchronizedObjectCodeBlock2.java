package com.xiaoqiang.sychronized;

    public class SynchronizedObjectCodeBlock2 implements Runnable {
             static SynchronizedObjectCodeBlock2 instance=new SynchronizedObjectCodeBlock2();
             Object lock1=new Object();
             Object lock2=new Object();
        @Override
        public void run() {
            synchronized(lock1) {
                System.out.println(Thread.currentThread().getName()+"lock1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "运行结束1");
            }
            synchronized(lock2) {
                System.out.println(Thread.currentThread().getName()+"lock2");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "运行结束2");
            }
        }

        public static void main(String[] args) {
             Thread t1=new Thread(instance);
             Thread t2=new Thread(instance);
             t1.start();
             t2.start();
             while (t1.isAlive()||t2.isAlive())
             {

             }
             System.out.println("结束");
        }
    }
