package com.xiaoqiang.collections.set;

import java.util.*;

public class SortDeom {
    class compareto implements Comparator<String>
    {


        @Override
        public int compare(String o1, String o2) {

            return o2.compareTo(o1);
        }
    }
    public  Comparator comparator()
    {
        return  new compareto();
    }
    public static void main(String[] args) {
        SortDeom sortDeom=new SortDeom();
        SortedSet<String> sortedSet=new TreeSet<>(sortDeom.comparator());
        Collections.addAll(sortedSet,"one two tree four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low=sortedSet.first();
        String high=sortedSet.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String> iterator=sortedSet.iterator();
        for(int i=0;i<=6;i++)
        {
            if(i==3) low=iterator.next();
            if(i==6) high=iterator.next();
            else iterator.next();
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedSet.subSet(low,high));
        System.out.println(sortedSet.headSet(high));
        System.out.println(sortedSet.tailSet(low));

    }
}
