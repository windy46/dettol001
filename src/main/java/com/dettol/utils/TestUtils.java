package com.dettol.utils;

public class TestUtils {

    public static void main(String[] args) {
        int[] array = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        printOut(array);
        insert(array);
    }

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
            printOut(source);
        }
    }

    private static void printOut(int[] array) {
        if(array == null){
            return;
        }
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
