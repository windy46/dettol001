package com.dettol.utils;

public class TestUtils {

    public static void main(String[] args) {
        int[] array = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        int[] array2 = {99, 88, 77, 66, 55, 44, 33, 22, 11,7,5,7,8,3,2,5,8,6,1,4,10};
        //printOut(array); //OPEN FOR #insert
        //insert(array); //OPEN FOR #insert
        insert1(array2);
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

    public static void insert1(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 0; i <= array.length - 1; i++) {
            int j = i;
            int tmp = array[i];
            while(j > 0 && array[j - 1] >= tmp){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
            printOut(array);
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
