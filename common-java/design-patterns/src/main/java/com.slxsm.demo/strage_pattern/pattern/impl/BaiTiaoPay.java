package com.slxsm.demo.strage_pattern.pattern.impl;

import com.slxsm.demo.strage_pattern.pattern.Payment;

import java.math.BigDecimal;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 白条支付
 * @author slxsm
 * @date 2020-03-13
 */
public class BaiTiaoPay implements Payment {

    @Override
    public void pay(BigDecimal price) {
        System.out.println(String.format("白条支付======%s======",price));
    }
}
