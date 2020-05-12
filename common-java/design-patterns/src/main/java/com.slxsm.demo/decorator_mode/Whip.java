package com.slxsm.demo.decorator_mode;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 调料
 * @author slxsm
 * @date 2020-05-12
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return .02 + beverage.cost();
    }
}
