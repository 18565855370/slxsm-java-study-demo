package com.slxsm.sf.stack;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-04-12
 */
public class ListStack<Item> implements MyStack<Item> {

    private Node top;
    private int n = 0;

    private class Node{
        Item item;
        Node next;
    }

    @Override
    public MyStack<Item> push(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = top;
        top = newNode;
        n++;
        return this;
    }

    @Override
    public Item pop() throws Exception {
        if (isEmpty()){
            throw new Exception("stack is empty");
        }
        Item item = top.item;
        top = top.next;
        n--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean hasNext() {
        return top != null;
    }

    @Override
    public Item next() {
        Item item = top.item;
        top = top.next;
        return item;
    }


    public static void main(String[] args) {
        short a = 1;
        a++;
    }
}
