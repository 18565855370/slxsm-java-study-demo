package com.slxsm.demo.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 被观察者的父类，保存观察者的列表
 * @author slxsm
 * @date 2020-03-15
 */
public class Subject {

    //观察者列表
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 注册观察者列表
     * @param observer 观察者
     */
    public void registerObserver(Observer observer){
        if (!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    /**
     * 解绑观察者对象
     * @param observer 观察者
     */
    public void unRegisterObserver(Observer observer){
        if (observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    /**
     * 通知所有注册的观察者执行对应操作
     */
    public void notifyObservers(){
        for (Observer observer : observerList){
            observer.updateNeed();
        }
    }
}
