package com.slxsm.demo.observer_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 客户端,触发端
 * @author slxsm
 * @date 2020-03-15
 */
public class BossClient {

    public static void main(String[] args) {
        ProductManage.getInstance().demandChanged();
    }
}
