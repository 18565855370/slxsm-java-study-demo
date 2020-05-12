package com.slxsm.demo.strage_pattern;

import com.slxsm.demo.strage_pattern.pattern.impl.WeixinPay;

import java.math.BigDecimal;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 策略模式客户端
 * @author slxsm
 * @date 2020-03-13
 */
public class Client {

    public static void main(String[] args) {
        ShopCart shopCart = new ShopCart();
        WeixinPay weixinPay = new WeixinPay();
        shopCart.setPayment(weixinPay);
        shopCart.pay(new BigDecimal("11.22"));
    }
}
