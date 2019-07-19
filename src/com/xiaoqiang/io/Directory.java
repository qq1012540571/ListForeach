package com.xiaoqiang.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Directory {

    public static File[] loacl(File dir,final String regex)
    {   Pattern pattern=Pattern.compile(regex);
        return dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[] local(String path,String regex)
    {
        return  loacl(new File(path),regex);
    }

    public static class TreeInfo implements  Iterable<File>
    {
        public List<File> files=new ArrayList<>();
        public List<File> dirs=new ArrayList<>();

        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }
        void addAll(TreeInfo other)
        {
            files.addAll(other.files);
            files.addAll(other.dirs);
        }

        @Override
        public String toString() {
            return "dirs"+dirs+"\n files"+files;
        }
    }
    static  TreeInfo recurseDirs(File startDir,String regex)
    {
        TreeInfo result=new TreeInfo();
        for(File item:startDir.listFiles())
        {
            if(item.isDirectory())
            {
                result.dirs.add(item);
                result.addAll((recurseDirs(item,regex)));
            }
            else
            {
                if(item.getName().matches(regex))
                {
                      result.files.add(item);
                }
            }
        }
        return result;
    }
    public static  TreeInfo walk(File start,String regex)
    {
        return  recurseDirs(start,regex);
    }

    public static  TreeInfo walk(File start)
    {
        return  recurseDirs(start,".*");
    }

    public static  TreeInfo walk(String start)
    {
        return  recurseDirs(new File(start),".*");
    }

    public static void main(String[] args) {
        if(args.length==0)
        {
                  System.out.println(walk("D:\\107D\\soft\\java"));
        }
        else
        {
            for (String arg:args)
            {
                System.out.println(walk(arg));
            }
        }
    }

}
