package com.xiaoqiang.collections.set;

import java.util.Comparator;
import java.util.Set;

public class TreeType extends SetType implements Comparable<TreeType> {
    public TreeType(int n) {
        super(n);
    }

    @Override
    public int compareTo(TreeType arg) {
        return  (arg.i>i ? -1:arg.i==i?0:1);
    }
}
