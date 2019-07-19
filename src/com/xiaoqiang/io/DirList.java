package com.xiaoqiang.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

    public static void main(String[] args) {
        File path=new File(".");
        String[] list=null;
         args=new String[]{"out","src"};
        if(args.length==0)
        {
            list=path.list();
        }
        else
        {   for(String a:args) {
            list = path.list(new DirFilter(a));
        }

        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem:list)
        {
            System.out.println(dirItem);
        }
    }
   static class DirFilter implements FilenameFilter
    {
        private Pattern pattern;

        public DirFilter(String regex) {
            pattern =Pattern.compile(regex);
        }


        @Override
        public boolean accept(File dir, String name) {
            return pattern.matcher(name).matches();
        }
    }
}
