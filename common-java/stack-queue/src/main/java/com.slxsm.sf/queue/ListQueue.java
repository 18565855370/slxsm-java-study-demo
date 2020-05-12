package com.slxsm.sf.queue;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-04-12
 */
public class ListQueue<Item> implements MyQueue<Item> {

    private Node first;
    private Node last;
    int n = 0;

    private class Node{
        Item item;
        Node next;
    }


    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public MyQueue<Item> add(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        if (isEmpty()){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        n++;
        return this;
    }

    @Override
    public boolean hasNext() {
        return first != null;
    }

    @Override
    public Item next() {
        Item item = first.item;
        first = first.next;
        return item;
    }

    @Override
    public void remove() {
//        if (isEmpty()){
//            throw new Exception("queue is empty");
//        }
        Node node = first;
        first = first.next;
        n--;
        if (isEmpty()){
            last = null;
        }
//        return node.item;
    }
}
