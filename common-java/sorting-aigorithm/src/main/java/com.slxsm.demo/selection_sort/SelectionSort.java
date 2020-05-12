package com.slxsm.demo.selection_sort;

import java.util.Arrays;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 选择排序
 * @author slxsm
 * @date 2020-03-23
 */
public class SelectionSort {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,6,2,7,13,0,24,22,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
