package com.slxsm.sf.queue;

import java.util.Iterator;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-04-12
 */
public interface MyQueue<Item> extends Iterator<Item> {

    int size();

    boolean isEmpty();

    MyQueue<Item> add (Item item);

    void remove() ;
}
