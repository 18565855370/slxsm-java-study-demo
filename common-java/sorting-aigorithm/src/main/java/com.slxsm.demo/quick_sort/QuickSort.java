package com.slxsm.demo.quick_sort;

import java.util.Arrays;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 快速排序，使用二分法进行排序
 * @author slxsm
 * @date 2020-04-12
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,6,2,7,13,0,24,22,0};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arrays, int low, int hight){
        if (arrays == null || arrays.length == 0){
            return;
        }
        if (low >= hight){
            return;
        }
        int left = low;
        int right = hight;
        int key = arrays[left];
        while (left < right){
            while (left < right && arrays[right] >= key){
                right--;
            }
            while (left < right && arrays[left] <= key){
                left++;
            }
            if (left < right){
                swap(arrays,left,right);
            }
        }
        swap(arrays,low,right);
        sort(arrays,low,left - 1);
        sort(arrays,left + 1,hight);
    }


    private static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
