package com.slxsm.demo.proxy_pattern.jdk;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 真实对象
 * @author slxsm
 * @date 2020-03-15
 */
public class CanteenJdk implements ProducerJdk {

    @Override
    public void sell() {
        System.out.println("小卖铺正在营业");
    }
}
