package com.slxsm.sf.stack;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-04-12
 */
public class ArrayStack<Item> implements MyStack<Item>{

    //栈元素数组，只能通过转型来创建泛型数组
    private Item[] items = (Item[]) new Object[1];

    private int n = 0;


    @Override
    public MyStack<Item> push(Item item) {
        check();
        items[n++] = item;
        return this;
    }

    @Override
    public Item pop() throws Exception {
        if (isEmpty()){
            throw new Exception("stack is empty");
        }
        Item item = items[--n];
        check();
        items[n] = null;
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

    private void check(){
        if (n >= this.items.length){
            resize(2 * this.items.length);
        }else if (n > 0 && n < this.items.length /4){
            resize(this.items.length/2);
        }
    }

    private void resize(int size){
        Item[] items = (Item[]) new Object[size];
        for (int i = 0; i < n; i++){
            items[i] = this.items[i];
        }
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return n > 0;
    }

    @Override
    public Item next() {
        return items[n--];
    }
}
