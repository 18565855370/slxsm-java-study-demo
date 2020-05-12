package com.slxsm.demo.build_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 奔驰的建造者
 * @author slxsm
 * @date 2020-03-15
 */
public class BenzBuilder extends AbstractBuild{

    @Override
    void buildEngine() {
        car.setEngine("奔驰的发动机");
    }

    @Override
    void buildSteering() {
        car.setSteering("奔驰的方向盘");
    }

    @Override
    void buildFrame() {
        car.setFrame("奔驰的车架");
    }

    @Override
    void buildTire() {
        car.setTire("奔驰的轮胎");
    }
}
