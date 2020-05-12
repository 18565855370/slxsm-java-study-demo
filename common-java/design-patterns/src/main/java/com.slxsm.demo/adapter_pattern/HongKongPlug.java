package com.slxsm.demo.adapter_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 港版充电头
 * @author slxsm
 * @date 2020-03-14
 */
public class HongKongPlug implements HongKongPlugAdapter {

    @Override
    public void powerWithHongKongStandard() {
        System.out.println("使用港版充电头充电");
    }
}
