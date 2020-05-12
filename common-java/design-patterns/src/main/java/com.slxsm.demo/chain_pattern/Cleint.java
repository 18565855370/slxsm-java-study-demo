package com.slxsm.demo.chain_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-03-15
 */
public class Cleint {

    public static void main(String[] args) {
        // 创建不同的快递员对象
        PostMan beijingPostMan = new BeiJingPostMan();
        PostMan shangHaiPostMan = new ShangHaiPostMan();
        PostMan guangZhouPostMan = new GuangZhouPostMan();

        // 创建下一个结点
        beijingPostMan.nextPostMan = shangHaiPostMan;
        shangHaiPostMan.nextPostMan = guangZhouPostMan;

        // 处理不同地区的快递，都是从首结点北京快递员开始
        System.out.println("有一个上海快递需要派送:");
        beijingPostMan.handleCourier("shanghai");
        System.out.println("有一个广州快递需要派送:");
        beijingPostMan.handleCourier("guangzhou");
        System.out.println("有一个美国快递需要派送:");
        beijingPostMan.handleCourier("America");
    }
}
