package com.slxsm.demo.decorator_mode;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 装饰器模式之顶级类->饮料类
 * @author slxsm
 * @date 2020-05-11
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
