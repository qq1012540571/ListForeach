package com.xiaoqiang.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set =new LinkedHashSet<>(CollectionData.list(new Government(),2));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(),10));
        System.out.println(set);

    }
}
