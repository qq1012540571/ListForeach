package com.xiaoqiang.proxy;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
    public static  void comsumer(Interface iface)
    {
        iface.doSomething();
        iface.somethingElse("虚啊全备份");
    }

    public static void main(String[] args) {
        RealObject realObject=new RealObject();
        comsumer(realObject);
        Interface proxy= (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(realObject));
        comsumer(proxy);
    }

}
