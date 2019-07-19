package com.xiaoqiang.StringTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {

    @Override
    public String toString() {
        return this.toString();
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
       Class a=Class.forName("com.xiaoqiang.test1.User");
        Method[] methods=a.getMethods();
        Field[] fields=a.getDeclaredFields();
        for(Field field:fields)
        {    field.setAccessible(true);
             field.set(field.getName(),3);
            System.out.println(field.get(field.getName()));
        }
        for(Method method:methods)
        {
            System.out.println(method.getName());
        }
    }
}
