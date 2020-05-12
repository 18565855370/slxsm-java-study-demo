package com.slxsm.demo.chain_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-03-15
 */
public class BeiJingPostMan extends PostMan {


    @Override
    public void handleCourier(String address) {
        if ("beijing".equals(address)){
            System.out.println("派送到北京");
            return;
        }else {
            nextPostMan.handleCourier(address);
        }
    }
}
