package com.xiaoqiang.generic;

public class TwoTuple<A,B> {
    public final  A one;
    public final  B two;

    public TwoTuple(A one, B two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> twoTuple=new TwoTuple<>("小强哥哥",10);
        System.out.println(twoTuple.toString());
    }
}
