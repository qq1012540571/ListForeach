package com.xiaoqiang.collections.queue;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
      static class ToDoItem implements  Comparable<ToDoItem>
      {
          private char primary;
          private int secondary;
          private String item;
          public ToDoItem(String td ,char pri,int sec)
          {
              primary=pri;
              secondary=sec;
              item=td;
          }

          @Override
          public int compareTo(ToDoItem arg) {
              if(primary>arg.primary)
              {
                  return  +1;
              }
              if(primary==arg.primary)
              {
                  if(secondary>arg.secondary)
                  {
                      return +1;
                  }
                  else if(secondary==arg.secondary)
                  {
                      return 0;
                  }
              }
              return -1;
          }

          @Override
          public String toString() {
              return "ToDoItem{" +
                      "primary=" + primary +
                      ", secondary=" + secondary +
                      ", item='" + item + '\'' +
                      '}';
          }
      }
      public void add(String td,char pri,int sec)
      {
          super.add(new ToDoItem(td,pri,sec));
      }

    public static void main(String[] args) {
        ToDoList toDoList=new ToDoList();
        toDoList.add("Empty",'C',4);
        toDoList.add("Feed dog",'A',2);
        toDoList.add("Feed bird",'B',7);
        toDoList.add("MOw lawn",'C',3);
        toDoList.add("water lawn",'A',1);
        toDoList.add("Feed cat",'B',1);
        System.out.println(toDoList);
        while(!toDoList.isEmpty())
        {
            System.out.println(toDoList.remove());
        }


    }
}
