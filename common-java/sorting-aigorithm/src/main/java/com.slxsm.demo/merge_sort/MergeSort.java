package com.slxsm.demo.merge_sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 归并排序，将元素分为大小相同的两端，然后进行排序再整合，和快速排序类似
 * @author slxsm
 * @date 2020-04-12
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,1,6,2,8,335,793,2426,83,79,1,0,9};
        System.out.println(Arrays.toString(sort(arr)));
    }


    public static int[] sort(int[] arrays){
        if (arrays.length <= 1){
            return arrays;
        }
        int num = arrays.length >> 1;
        int[] prefixArr = Arrays.copyOfRange(arrays,0,num);
        int[] endArr = Arrays.copyOfRange(arrays,num,arrays.length);
        return mergeTwoArrays(sort(prefixArr),sort(endArr));
    }

    public static int[] mergeTwoArrays(int[] a, int[] b){
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.length + b.length];
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                result[k++] = a[i++];
            }else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length){
            result[k++] = a[i++];
        }
        while (j < b.length){
            result[k++] = b[j++];
        }
        return result;
    }
}
