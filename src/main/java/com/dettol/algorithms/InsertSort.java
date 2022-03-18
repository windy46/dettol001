package com.dettol.algorithms;

/**
 * @Author: Winkey
 * @date: 2022/3/18 22:39
 */
public class InsertSort {

    public static void insert(int[] source){
        for (int i = 0, value, j ; source != null && i < source.length; i++) {
            for (j = i, value = source[i]; j > 0 && source[j - 1] > value; j--) {
                source[j] = source[j - 1];
            }
            source[j] = value;
        }
    }

}
