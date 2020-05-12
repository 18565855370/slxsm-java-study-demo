package com.slxsm.demo.proxy_pattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-03-15
 */
public class CanteenProxy {

    public static void main(String[] args) {
        ProducerJdk producerJdk = new CanteenJdk();
        ProducerJdk producerJdkProxy =
                (ProducerJdk) Proxy.newProxyInstance(ProducerJdk.class.getClassLoader(),
                        producerJdk.getClass().getInterfaces(), (proxy, method, args1) -> {
                            System.out.println("==========小卖铺卖货前==========");
                            Object invoke = method.invoke(producerJdk, args);
                            System.out.println("==========小卖铺卖货后==========");
                            return invoke;
                        });
        producerJdkProxy.sell();
    }
}
