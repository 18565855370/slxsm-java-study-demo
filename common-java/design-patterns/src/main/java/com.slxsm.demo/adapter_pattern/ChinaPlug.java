package com.slxsm.demo.adapter_pattern;

import java.util.concurrent.locks.LockSupport;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 目标对象：目标充电头
 * @author slxsm
 * @date 2020-03-14
 */
public class ChinaPlug implements ChinaPlugTarget {

    @Override
    public void powerWithChinaStandard() {
        LockSupport.park();
        System.out.println("使用国标充电头供电");
    }
}
