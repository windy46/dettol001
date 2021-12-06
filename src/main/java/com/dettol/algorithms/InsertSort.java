package com.dettol.algorithms;

/**
 * @Author: Winkey
 * @date: 2021/12/6 17:00
 */
public class InsertSort {

    public static void insert(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for(int i = 1; i < source.length; i++){
            int j = i;
            int tmp = source[i];
            boolean needSwap = false;
            while(j > 0 && source[j - 1] > tmp){
                needSwap = true;
                source[j] = source[j - 1];
                j--;
            }
            if(needSwap){
                source[j] = tmp;
            }
        }
    }

}
