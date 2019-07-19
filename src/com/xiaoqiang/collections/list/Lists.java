package com.xiaoqiang.collections.list;

import java.util.*;

public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<Integer> a)
    {
        a.addAll(Arrays.asList(4,2,9,1,3));


    }
    public static void itorSet(List<String> a)
    {
        lit= a.listIterator();
        while(lit.hasNext())
        {
            lit.set(lit.next()+1);
        }
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        basicTest(list);
        set.addAll(list);
        System.out.println(set);

        System.out.println(list);
    }
}
