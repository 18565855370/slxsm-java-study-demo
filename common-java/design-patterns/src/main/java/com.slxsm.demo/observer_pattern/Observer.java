package com.slxsm.demo.observer_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 观察者接口类，所有观察者都实现该接口，当被观察者有变化需要通知时，这是一个共同的接口
 * @author slxsm
 * @date 2020-03-15
 */
public interface Observer {

    void updateNeed();
}
