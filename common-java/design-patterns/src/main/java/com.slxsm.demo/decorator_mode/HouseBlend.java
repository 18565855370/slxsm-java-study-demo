package com.slxsm.demo.decorator_mode;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-05-11
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
