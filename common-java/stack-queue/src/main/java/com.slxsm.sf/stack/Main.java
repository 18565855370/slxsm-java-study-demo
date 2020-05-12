package com.slxsm.sf.stack;

import java.util.Arrays;

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
        MyStack<String> stack = new ArrayStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());

        MyStack<String> listStack = new ListStack<>();
        listStack.push("a");
        listStack.push("b");
        listStack.push("c");
        listStack.push("d");
        listStack.push("e");
        listStack.push("f");
        System.out.println(listStack.size());
        listStack.pop();
        System.out.println(listStack.size());
    }
}
