package com.xiaoqiang.generic;

public class GenricMethods {

     public <T,A,B> void f(T x,A a,B b)
     {
         System.out.println(x.getClass().getName());
         System.out.println(a.getClass().getName());
         System.out.println(b.getClass().getName());
     }

    public static void main(String[] args) {
        GenricMethods genricMethods=new GenricMethods();
        genricMethods.f(123,"无敌",new int[]{1,2,3});
    
    }


}
