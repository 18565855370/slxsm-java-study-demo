package com.slxsm.demo.chain_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-03-15
 */
public class ShangHaiPostMan extends PostMan {

    @Override
    public void handleCourier(String address) {
        if ("shanghai".equals(address)){
            System.out.println("派送到上海");
        }else {
            nextPostMan.handleCourier(address);
        }
    }
}
