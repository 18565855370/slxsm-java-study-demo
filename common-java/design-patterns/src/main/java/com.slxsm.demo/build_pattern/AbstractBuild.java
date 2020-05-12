package com.slxsm.demo.build_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 抽象建造者，定义造车的方法
 * @author slxsm
 * @date 2020-03-15
 */
public abstract class AbstractBuild {
    /**
     * 造的是车
     */
    protected Car car = new Car();

    /**
     * 建造发动机
     */
    abstract void buildEngine();
    /**
     *造轮胎
     */
    abstract void buildSteering();
    /**
     * 造车架
     */
    abstract void buildFrame();
    /**
     * 造轮胎
     */
    abstract void buildTire();

    /**
     * 得到造好的车
     * @return 造好的车
     */
    public Car buildCar(){
        return this.car;
    }
}
