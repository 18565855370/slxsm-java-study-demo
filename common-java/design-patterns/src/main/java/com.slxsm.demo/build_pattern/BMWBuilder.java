package com.slxsm.demo.build_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 宝马车建造者
 * @author slxsm
 * @date 2020-03-15
 */
public class BMWBuilder extends AbstractBuild {

    @Override
    void buildEngine() {
        car.setEngine("宝马的发动机");
    }

    @Override
    void buildSteering() {
        car.setSteering("宝马的方向盘");
    }

    @Override
    void buildFrame() {
        car.setFrame("宝马的车架");
    }

    @Override
    void buildTire() {
        car.setTire("宝马的轮胎");
    }
}
