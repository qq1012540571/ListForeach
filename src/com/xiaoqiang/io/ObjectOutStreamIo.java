package com.xiaoqiang.io;

import java.io.*;
import java.util.Date;
import java.util.List;

public class ObjectOutStreamIo {

    public static void main(String[] args) {

        ObjectInputStream objectInputStream=null;


        try {

            objectInputStream=new ObjectInputStream(new FileInputStream("a.txt"));
            List<User> user1= (List<User>) objectInputStream.readObject();
            System.out.println(user1);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objectInputStream!=null)
            {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
