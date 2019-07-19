package com.xiaoqiang.io;

import java.io.*;

public class InputStreamIo {
    public static void main(String[] args) throws IOException {
        InputStream inputStream= null;
        OutputStream out=null;
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        byte[] bytes=new byte[1024];
        try {
            inputStream = new FileInputStream("D:\\xiaoqiang\\aas.png");
            out = new FileOutputStream("D:\\xiaoqiang\\aaa.png");
            bufferedInputStream=new BufferedInputStream(inputStream);
            bufferedOutputStream=new BufferedOutputStream(out);
            while(bufferedInputStream.read(bytes)>0)
            {
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

          if(bufferedInputStream!=null)
          {
              bufferedInputStream.close();
          }
          if(bufferedOutputStream!=null)
          {
              bufferedOutputStream.close();
          }
        }


    }
}
