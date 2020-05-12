package com.slxsm.demo.build_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 指挥者
 * @author slxsm
 * @date 2020-03-15
 */
public class Boss {

    public static Car builderCar(AbstractBuild build){
        build.buildEngine();
        build.buildFrame();
        build.buildSteering();
        build.buildTire();
        return build.buildCar();
    }

}
