package com.xiaoqiang.collections.list;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("黄小三","黄小四");
        list.set(0,"黄肥强");
        System.out.println(list);
        list= Collections.unmodifiableList(list);
        System.out.println(list);
    }
}
