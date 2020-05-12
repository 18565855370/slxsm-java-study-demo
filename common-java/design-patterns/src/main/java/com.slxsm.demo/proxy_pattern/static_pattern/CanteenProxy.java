package com.slxsm.demo.proxy_pattern.static_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 代理类
 * @author slxsm
 * @date 2020-03-15
 */
public class CanteenProxy implements Producer {

    private Producer producer;

    public CanteenProxy(Producer producer){
        this.producer = producer;
    }

    @Override
    public void sell() {
        System.out.println("================小卖铺卖货前================");
        producer.sell();
        System.out.println("================小卖铺卖货后================");
    }
}
