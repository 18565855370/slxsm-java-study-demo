package com.slxsm.demo.observer_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 被观察者：产品经理角色
 * @author slxsm
 * @date 2020-03-15
 */
public class ProductManage extends Subject {

    private ProductManage(){}

    private static class ProductManageHolder {
        private static final ProductManage PRODUCT_MANAGE = new ProductManage();
    }

    public static ProductManage getInstance(){
        return ProductManageHolder.PRODUCT_MANAGE;
    }

    public void demandChanged(){
        notifyObservers();
    }

}
