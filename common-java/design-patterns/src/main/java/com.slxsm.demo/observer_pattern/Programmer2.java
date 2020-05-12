package com.slxsm.demo.observer_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 具体的观察者，如程序员
 * @author slxsm
 * @date 2020-03-15
 */
public class Programmer2 implements Observer {

    public Programmer2(){
        ProductManage.getInstance().registerObserver(this);
    }

    @Override
    public void updateNeed() {
        System.out.println("傻逼产品，一直都是这样改需求");
    }
}
