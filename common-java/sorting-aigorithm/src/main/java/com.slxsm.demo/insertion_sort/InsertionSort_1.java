package com.slxsm.demo.insertion_sort;

import java.util.Arrays;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 插入排序，选择元素和前面的已排序元素对比，小于前面的元素是就插入到当前位置
 * @author slxsm
 * @date 2020-04-12
 */
public class InsertionSort_1 {

    public static int[] sort(int[] arrays){
        for (int i = 1; i < arrays.length; i++) {
            int preIndex = i - 1;
            int current = arrays[i];
            while (preIndex >= 0 && arrays[preIndex] > current){
                arrays[preIndex + 1] = arrays[preIndex];
                preIndex--;
            }
            arrays[preIndex + 1] = current;
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,6,2,7,13,0,24,22,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
