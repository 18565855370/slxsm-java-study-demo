package com.slxsm.demo.adapter_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 客户端
 * @author slxsm
 * @date 2020-03-14
 */
public class Client {

    public static void main(String[] args) {
        ChinaPlug chinaPlug = new ChinaPlug();
        chinaPlug.powerWithChinaStandard();

        HongKongPlug hongKongPlug = new HongKongPlug();
        ChinaPlugAdapter chinaPlugAdapter = new ChinaPlugAdapter(hongKongPlug);
        chinaPlugAdapter.powerWithChinaStandard();
    }
}
