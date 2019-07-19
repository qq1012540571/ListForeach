package com.xiaoqiang.exception;

public class ExceptionTest {
      public  void f() throws MyException {
          System.out.println("抛出方法f()");
          throw  new MyException("小强异常");
      }

    public static void main(String[] args) {
          ExceptionTest test=new ExceptionTest();
          int i=0;
          while(i!=10) {
              try {
                  if (i!=10) {
                      test.f();
                  }

              } catch (Exception e) {
                  i++;
                  e.printStackTrace();
              } finally {
                  System.out.println(i);
              }
          }
    }
}
