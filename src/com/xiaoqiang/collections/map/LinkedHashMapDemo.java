package com.xiaoqiang.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"A1");
        map.put(2,"A2");
        map.put(3,"A3");
        map.put(4,"A4");
        map.put(5,"A5");

        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>(map);
        System.out.println(linkedHashMap);
        linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.putAll(map);
        System.out.println(linkedHashMap);


    }
}
