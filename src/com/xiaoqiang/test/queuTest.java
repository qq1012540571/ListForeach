package com.xiaoqiang.test;

import java.util.LinkedList;
import java.util.Queue;

public class queuTest {

    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);;
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}
