package com.slxsm.demo.chain_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 责任链抽象类
 * @author slxsm
 * @date 2020-03-15
 */
public abstract class PostMan {

    //下一个快递员
    protected PostMan nextPostMan;

    /**
     * 派送快递
     * @param address 地址
     */
    public abstract void handleCourier(String address);
}
