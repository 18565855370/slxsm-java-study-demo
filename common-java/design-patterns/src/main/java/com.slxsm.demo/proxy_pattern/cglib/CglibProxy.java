package com.slxsm.demo.proxy_pattern.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 代理类
 * @author slxsm
 * @date 2020-03-15
 */
public class CglibProxy implements MethodInterceptor {

    private Canteen canteen;

    public CglibProxy(Canteen canteen){
        this.canteen = canteen;
    }

    Canteen proxy(){
        //创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //设置代理目标类
        enhancer.setSuperclass(Canteen.class);
        //设置回调方法，this代表的是当前类，因为当前类实现了callback
        enhancer.setCallback(this);
        return (Canteen) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("==========小卖铺卖货前==========");
        Object invoke = method.invoke(canteen, objects);
        System.out.println("==========小卖铺卖货后==========");
        return invoke;
    }


    public static void main(String[] args) {
        Canteen canteen = new Canteen();
        Canteen canteenProxy = new CglibProxy(canteen).proxy();
        canteenProxy.sell();
    }
}
