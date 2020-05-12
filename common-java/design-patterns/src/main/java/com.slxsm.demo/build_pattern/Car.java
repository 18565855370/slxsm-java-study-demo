package com.slxsm.demo.build_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 汽车产品类: 定义汽车的构成
 * @author slxsm
 * @date 2020-03-15
 */
public class Car {
    /**
     * 方向盘
     */
    private String steering;
    /**
     * 发动机
     */
    private String engine;
    /**
     * 车架
     */
    private String frame;
    /**
     * 轮胎
     */
    private String tire;

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steering='" + steering + '\'' +
                ", engine='" + engine + '\'' +
                ", frame='" + frame + '\'' +
                ", tire='" + tire + '\'' +
                '}';
    }
}
