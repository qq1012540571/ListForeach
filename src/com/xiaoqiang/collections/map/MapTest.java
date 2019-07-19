package com.xiaoqiang.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest extends HashMap  {


    public static void main(String[] args) {
         Map<String,String> map=new HashMap<>();
        Map<String,String> map1=new TreeMap<>();
        Map<String,String> map2=new LinkedHashMap<>();
         for (int i=0;i<5;i++) {
             map.put(String.valueOf(i),"小强"+i);
         }
        for (int i=0;i<5;i++) {
            map1.put(String.valueOf(i),"小强"+i);
        }
        for (int i=0;i<5;i++) {
            map2.put(String.valueOf(i),"小强"+i);
        }
         System.out.println(map.hashCode());

        System.out.println(map1);
        System.out.println(map2);
    }
}
