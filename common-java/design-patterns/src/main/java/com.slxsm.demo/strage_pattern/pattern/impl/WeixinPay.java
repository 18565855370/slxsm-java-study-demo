package com.slxsm.demo.strage_pattern.pattern.impl;

import com.slxsm.demo.strage_pattern.pattern.Payment;

import java.math.BigDecimal;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 微信支付
 * @author slxsm
 * @date 2020-03-13
 */
public class WeixinPay implements Payment {

    @Override
    public void pay(BigDecimal price) {
        System.out.println(String.format("微信支付======%s======",price));
    }
}
