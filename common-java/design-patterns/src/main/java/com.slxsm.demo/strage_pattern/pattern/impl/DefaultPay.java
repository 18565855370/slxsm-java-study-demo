package com.slxsm.demo.strage_pattern.pattern.impl;

import com.slxsm.demo.strage_pattern.pattern.Payment;

import java.math.BigDecimal;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 还未开通的支付方式
 * @author slxsm
 * @date 2020-03-13
 */
public class DefaultPay implements Payment {

    @Override
    public void pay(BigDecimal price) {
        System.out.println("您选择的支付方式暂未开通");
    }
}
