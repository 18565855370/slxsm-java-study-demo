package com.slxsm.demo.proxy_pattern.static_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-03-15
 */
public class Client {

    public static void main(String[] args) {
        Producer producer = new Canteen();
        CanteenProxy proxy = new CanteenProxy(producer);
        proxy.sell();
    }
}
