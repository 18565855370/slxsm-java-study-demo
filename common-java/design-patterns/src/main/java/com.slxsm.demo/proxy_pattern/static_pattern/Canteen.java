package com.slxsm.demo.proxy_pattern.static_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 真实类
 * @author slxsm
 * @date 2020-03-15
 */
public class Canteen implements Producer {

    @Override
    public void sell() {
        System.out.println("小卖铺正在营业");
    }
}
