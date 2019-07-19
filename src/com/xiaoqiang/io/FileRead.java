package com.xiaoqiang.io;

import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        File file=new File("D:\\xiaoqiang\\a.txt");
        File file1=new File("D:\\xiaoqiang\\b.txt");
        char[] chars=new char[5];
        int len=-1;
        String abc=null;
        try {
            Reader reader=new FileReader(file);
            Writer writer=new FileWriter(file1);
            while((len=reader.read(chars))!=-1)
            {

                writer.write(new String(chars,0,len));
            }
                ;




           writer.flush();
            writer.close();
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
