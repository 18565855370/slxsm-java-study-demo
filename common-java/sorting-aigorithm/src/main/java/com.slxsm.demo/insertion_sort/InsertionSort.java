package com.slxsm.demo.insertion_sort;

import java.util.Arrays;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 插入排序
 * @author slxsm
 * @date 2020-03-24
 */
public class InsertionSort {

    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int preIndex = i - 1;
            int current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current){
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,6,2,7,13,0,24,22,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
