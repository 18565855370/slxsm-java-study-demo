package com.slxsm.demo.decorator_mode;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-05-12
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .88;
    }
}
