package com.xiaoqiang.generic;

public class Hodler3<T>  {
      private T xiaoqiang;

    public T getXiaoqiang() {
        return xiaoqiang;
    }

    public void setXiaoqiang(T xiaoqiang) {
        this.xiaoqiang = xiaoqiang;
    }

    public static void main(String[] args) {
         Hodler3<String> a=new Hodler3<>();
         a.setXiaoqiang("狗东西");
         System.out.println( a.getXiaoqiang());

    }
}
