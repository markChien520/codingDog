package com.imooc.demo.controller;

import java.util.Arrays;

public class Test0321 {
    public static void main(String[] args) {
        int[] arr = new int []{1,2,3,4,5,6,7,8,9,0};
        int[] indexByTarget = getIndexByTarget(arr,13);
        StringBuilder sb = new StringBuilder("[");
        if (indexByTarget != null) {
            for (int i : indexByTarget
            ) {
                sb.append(i + ",");
            }
        }
        String substring = sb.substring(0, sb.length()-1);
        System.out.println(substring + "]");
        System.out.println(Arrays.toString(indexByTarget));

    }

    private static int[] getIndexByTarget(int[] arr, int target) {
        if (arr == null || arr.length <2 ){
            return null;
        }
        int[] result = new int[2];
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length ; k++) {
                if (j + k == target){
                    result[0] = j;
                    result[1] = k;
                    return  result;
                }
            }
        }
        return null;
    }
}
