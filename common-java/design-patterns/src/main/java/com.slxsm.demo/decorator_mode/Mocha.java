package com.slxsm.demo.decorator_mode;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 调料->摩卡
 * @author slxsm
 * @date 2020-05-12
 */
public class Mocha  extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
