package com.slxsm.sf.queue;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-04-12
 */
public class Main {

    public static void main(String[] args) throws Exception {
        MyQueue<String> queue = new ListQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue.size());
    }
}
