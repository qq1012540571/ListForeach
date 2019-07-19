package com.xiaoqiang.collections;

import java.util.ArrayList;

public class CollectionData<T>  extends ArrayList<T> {
    public CollectionData(Generator<T> Gen,int quantity) {
        for(int i=0;i<quantity;i++)
        {
            add(Gen.next());
        }
    }
    public static <T>  CollectionData<T>  list(Generator<T> Gen,int quantity)
    {
        return  new CollectionData(Gen,quantity);
    }
}
