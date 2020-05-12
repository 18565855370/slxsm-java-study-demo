package com.slxsm.demo.strage_pattern;

import com.slxsm.demo.strage_pattern.pattern.Payment;

import java.math.BigDecimal;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 策略模式之购物车类
 * @author slxsm
 * @date 2020-03-13
 */
public class ShopCart {

    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public ShopCart(){}

    public void pay(BigDecimal price){
        payment.pay(price);
    }



}
