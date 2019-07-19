package com.xiaoqiang.design;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {

    public static void main(String[] args) {
        ProxySaler proxySaler=new ProxySaler();
        Person object= (Person) proxySaler.newInstall(new xiaoQiang("黄豪强","南山区"));
        object.buy1();
        object.buy();




       /* byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{object.getClass()});
        try {
            OutputStream outputStream=new FileOutputStream("$abc.txt");
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /* System.out.println(aa);*/
      /*try{
          System.out.println(object.getClass().getMethod("buy",Person.class));
      }
      catch (Exception e)
      {
          System.out.println("异常");
      }*/
    /*    object.buy1();*/
    }
}
