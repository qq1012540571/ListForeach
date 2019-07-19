package com.xiaoqiang.io;

import java.io.*;

public class FileIo {

    public static void main(String[] args) {
         File file=new File("D:\\xiaoqiang\\a.txt");
         if(!file.exists())
         {
             try {
                 file.createNewFile();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         else {
             try {
                 long a=System.currentTimeMillis();
                 System.out.println(a);
                 Writer writer=new FileWriter(file);
                 for(int i=0;i<10000;i++) {
                     writer.write("大上大厦三aaa大傻\n");
                     if(i%1000==0)
                     {
                         writer.flush();
                     }
                 }

                 if(writer!=null)
                 {
                     writer.close();
                 }
                 long b=System.currentTimeMillis();
                 System.out.println(b);
                 System.out.println(b-a);
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }




    }
}
