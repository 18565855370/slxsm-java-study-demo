package com.slxsm.demo.bubble_sort;

import java.util.Arrays;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *  冒泡排序 两两比较，所有的都比较完成后就是有序的
 * @author slxsm
 * @date 2020-04-12
 */

public class BubbleSort_1 {


    public static int[] sort(int[] arrays){
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,6,2,7,13,0,24,22,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
