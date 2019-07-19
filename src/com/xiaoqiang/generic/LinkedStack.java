package com.xiaoqiang.generic;

import com.xiaoqiang.test1.User;

import java.util.Iterator;

public class LinkedStack<T> implements Iterable<User> {
      public Iterator<User> iterator()
      {
          return new xiaoqiang();
      }
      public static <T> void test(T i)
      {
          T k=i;
          System.out.println(k);
      }

     private static class Node<T>
     {
         T item;
         Node<T> next;
         Node(){
             item=null; next=null;
         }
         Node(T item,Node<T> next)
         {
             this.item=item;
             this.next=next;
         }
         boolean end(){

             return (item==null && next==null);

         }
     }
     private Node<T> top= new Node<T>();
     public void push(T item)
     {
         top=new Node<T>(item,top);
     }
     public T pop()
     {
         T result=top.item;
         if(!top.end())
         {
             top=top.next;
         }
         return  result;
     }
  class xiaoqiang implements Iterator<User>
    {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public User next() {
            return null;
        }
    }
    public static void main(String[] args) {
        LinkedStack<String> lss=new LinkedStack<>();
        for(String s:("xiao qiang ai min min").split(" "))
        {
            lss.push(s);
        }
        String s;
        while((s=lss.pop())!=null)
        {
            System.out.println(s);
        }
        test("黄大强啊");
    }
}
