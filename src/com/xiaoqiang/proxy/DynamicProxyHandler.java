package com.xiaoqiang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
   private Object proxied;
   public DynamicProxyHandler(Object proxied)
   {
       this.proxied=proxied;
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

       System.out.println("获取代理类名称"+proxy.getClass()+"方法"+method+"传递的参数"+args);

       if(args!=null)
       {
           for(Object object:args)
           {
               System.out.println(" " +object);
           }

       }
        return method.invoke(proxied,args);
    }
}
