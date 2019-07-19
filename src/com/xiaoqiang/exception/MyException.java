package com.xiaoqiang.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException extends Exception{
      private static Logger logger=Logger.getLogger("MyException");
         public  MyException(){};
         public  MyException(String a){
             StringWriter trace=new StringWriter();
             printStackTrace(new PrintWriter(trace));
             logger.severe(trace.toString());
         };
}
