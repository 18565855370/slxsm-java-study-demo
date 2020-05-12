package com.slxsm.demo.chain_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-03-15
 */
public class GuangZhouPostMan extends PostMan {

    @Override
    public void handleCourier(String address) {
        if ("guangzhou".equals(address)){
            System.out.println("派送到广州");
        }else {
            if (nextPostMan != null){
                nextPostMan.handleCourier(address);
            }
        }
    }
}
