package com.xiaoqiang.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectInputStreamIo {
    public static void main(String[] args) {
           User user=new User(1,"黄豪强",new Date());
        User user1=new User(2,"黄豪强1",new Date());
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);
        ObjectOutputStream objectOutputStream=null;

        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream("a.txt"));


            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            if(objectOutputStream!=null)
            {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
