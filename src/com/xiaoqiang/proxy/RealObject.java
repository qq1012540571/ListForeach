package com.xiaoqiang.proxy;

public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }

    @Override
    public void somethingElse(String arg) {
      System.out.println("something" + arg);
    }
}
