package com.slxsm.demo.adapter_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 适配器
 * @author slxsm
 * @date 2020-03-14
 */
public class ChinaPlugAdapter implements ChinaPlugTarget {

    private HongKongPlugAdapter hongKongPlugAdapter;

    public ChinaPlugAdapter(HongKongPlugAdapter hongKongPlugAdapter){
        this.hongKongPlugAdapter = hongKongPlugAdapter;
    }


    @Override
    public void powerWithChinaStandard() {
        hongKongPlugAdapter.powerWithHongKongStandard();
    }
}
