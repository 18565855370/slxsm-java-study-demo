package com.slxsm.demo.bubble_sort;

import java.util.Arrays;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-03-22
 */
public class BubbleSort {

    public static void sort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = 0; j < length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,6,2,8,335,793,2426,83,79,1,0,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
