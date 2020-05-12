package com.slxsm.demo.singleton_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 静态内部类单例模式->在家外部类的时候不会实例化，当调用方法的时候才会加载singleton
 * @author slxsm
 * @date 2020-03-14
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    public static class SubStaticInnerClassSingleton{
        private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return SubStaticInnerClassSingleton.singleton;
    }
}
