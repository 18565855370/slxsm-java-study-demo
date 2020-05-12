package com.slxsm.demo.selection_sort;

import java.util.Arrays;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 选择排序，就是选择出数组中的int[] arr = new int[]{4,1,6,2,7,13,0,24,22,0};最小的一个值，和数组中的第一个位置交换，然后再在未排序中找到最小的值和第二个位置交换
 * @author slxsm
 * @date 2020-04-12
 */
public class SelectionSort_1 {


    public static int[] sort(int[] arrays){
        for (int i = 0; i < arrays.length -1; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[min] > arrays[j]){
                    min = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[min];
            arrays[min] = temp;
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,6,2,7,13,0,24,22,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
