package com.xiaoqiang.collections.map;

import com.xiaoqiang.proxy.Interface;

import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

class FlyWeightMap extends AbstractList<Integer> {
    private int size;
    public FlyWeightMap(int size) {
        this.size=size<0 ? 0:size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new FlyWeightMap(50));
    }
}
