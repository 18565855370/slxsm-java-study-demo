package com.slxsm.sf.stack;

import java.util.Iterator;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 栈,FiLo,先入后出
 * @author slxsm
 * @date 2020-04-12
 */
public interface MyStack<Item> extends Iterator<Item> {

    MyStack<Item> push(Item item);

    Item pop() throws Exception;

    boolean isEmpty();

    int size();
}
