package com.slxsm.demo.build_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 客户端
 * @author slxsm
 * @date 2020-03-15
 */
public class Client {

    public static void main(String[] args) {
        Car bmwCar = Boss.builderCar(new BMWBuilder());
        System.out.println("宝马车：" + bmwCar.toString());

        Car benzCar = Boss.builderCar(new BenzBuilder());
        System.out.println("奔驰车：" + benzCar.toString());
    }
}
