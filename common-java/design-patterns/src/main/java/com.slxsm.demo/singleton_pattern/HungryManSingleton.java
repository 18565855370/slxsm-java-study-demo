package com.slxsm.demo.singleton_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 饿汉模式,可以理解为很着急，很饥渴，所以在加载类的时候被初始化出来的
 * @author slxsm
 * @date 2020-03-14
 */
public class HungryManSingleton {

    public static HungryManSingleton singleton = new HungryManSingleton();
    private HungryManSingleton(){}
    public static HungryManSingleton getInstance(){
        return getInstance();
    }
}
