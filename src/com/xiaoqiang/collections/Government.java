package com.xiaoqiang.collections;

public class Government implements  Generator<String> {
    String[] foundation=("wo shi ni de a tian tian qi fu wo").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }


}
