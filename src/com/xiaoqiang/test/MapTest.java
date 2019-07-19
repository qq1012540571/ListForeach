package com.xiaoqiang.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {

    public static void main(String[] args) {
        Random random=new Random(47);
        Map<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<1000;i++)
        {
            Integer integer=random.nextInt(100);
            map.put(integer,map.get(integer)==null?1:map.get(integer)+1);
        }
        for(Integer integer:map.keySet())
        {
            System.out.println(integer+":"+map.get(integer));
        }


    }
}
