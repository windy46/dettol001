package com.dettol.utils;

public class TestUtils {

    public static void main(String[] args) {
        int[] array = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        int[] array2 = {99, 88, 77, 66, 55, 44, 33, 22, 11,7,5,7,8,3,2,5,8,6,1,4,10};
        int[] array3 = {99, 88, 77, 66, 55, 44, 33, 22, 2,5,3,4,5,6,7,8,2,1,9,0};
        //printOut(array); //OPEN FOR #insert
        //insert(array); //OPEN FOR #insert
        //insert2(array2); //OPEN FOR #insert2
//        printOut(array2); //OPEN FOR #insert2
        insert32(array3);
        printOut(array3); //OPEN FOR #insert3
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

    public static void insert2(int[] array){
       if(array == null || array.length == 0){
           return;
       }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int value = array[i];
            int j = i;
            while(j > 0 && array[j-1] > value){
                array[j] = array[j-1];
                j--;
            }
            array[j] = value;
        }
    }

    public static void insert3(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 1; i < source.length; i++) {
            printOut(source);
            int value = source[i];
            int priotIndex = i - 1;
            while(priotIndex >= 0 && source[priotIndex] > value){
                source[priotIndex + 1] = source[priotIndex];
                priotIndex--; //priotIndex后移一位再进行下一轮比较
            }
            source[priotIndex + 1] = value;//如果以上步骤进入while循环,则priotIndex+1为最后一次比较移动的位置,如果没进入while循环,则priotIndex为i
        }
    }

    public static void insert4(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 1; i < source.length; i++) {
            printOut(source);
            int temp = source[i];
            int j = i;
            while(j > 0 && source[j - 1] > temp){
                source[j] = source[j - 1];
                j--;
            }
            source[j] = temp;
        }
    }

    public static void insert5(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            printOut(arr);
            int j = i;
            int value = arr[i];
            while(j > 0 && arr[j - 1] > value){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = value;
        }
    }

    public static void insert6(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        int i = 0;
        while(i <= array.length - 1){
            printOut(array);
            int j =i;
            int value = array[i];
            while(j > 0 && array[j-1] > value){
                array[j] = array[j -1];
                j--;
            }
            array[j] = value;
            i++;
        }
    }

    public static void insert7(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int j = i - 1;
            int tmp = array[i];
            while(j >= 0 && array[j] > tmp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }

    public static void insert8(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        int i = 0;
        while(i < array.length){
            printOut(array);
            int value = array[i];
            int j = i;
            while(j > 0 && array[j - 1] > value){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
            i++;
        }
    }

    public static void insert9(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
             printOut(array);
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--){
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }

        }
    }

    public static void insert10(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for(int i = 0; i < array.length; i++){
            printOut(array);
            int value = array[i];
            int j;
            for(j = i; j > 0 && array[j - 1] > value; j--){
                array[j] = array[j - 1];
            }
            array[j] = value;
        }
    }

    public static void insert11(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for(int i = 1; i < array.length; i++){
            printOut(array);
            int j = i-1;
            int temp = array[i];
            while(j>=0){
                if(array[j] > temp){
                    array[j + 1] = array[j];
                }else{
                    break;
                }
                j--;
            }
            array[j+1] = temp; //这一步很重要，应该是和交换排序的区别
        }
    }

    public static void insert12(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int value1 = array[i]; //记录lastIndex array
            int value2 = array[i];
            int j;
            for(j = i; j > 0 && array[j - 1] > array[i];j--){
                if(j == i) {
                    value1 = array[j - 1]; //保留lastIndex
                }else{
                    array[j] = array[j - 1]; //正常普通index向前一步
                }
            }
            array[i] = value1;
            array[j] = value2;
            //TODO: array[i]值不变直到找到原值合适位置,这算是插入排序吗?
        }
    }

    public static void insert13(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int value = array[i];
            int j;
            for(j = i; j > 0 ; j--){
                if(array[j - 1] > value){
                    array[j] = array[j - 1];
                }else{
                    break;
                }
            }
            array[j] = value;
        }
    }

    public static void insert14(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        int i = 1;
        do{
            int value = source[i];
            printOut(source);
            int j = i;
            do{
                source[j] = source[j - 1];
                j--;
            }while(j > 0 && source[j - 1] > value);
            source[j] = value;
            i++;
        }while(i < source.length);
    }

    public static void insert15(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int value = array[i];
            int j;
            for(j = i - 1; j >= 0 && value < array[j]; j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = value;
        }
    }

    public static void insert16(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int tmp = array[i];
            int j = i;
            for (; j >= 1 && array[j - 1] > tmp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }

    public static void insert17(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 0; i <= array.length - 1; i++) {
            printOut(array);
            int value = array[i];
            int j = i;
            for (; j > 0; j--) {
                if(array[j - 1] > value){
                    array[j] = array[j - 1];
                }else{
                    break;
                }
            }
            array[j] = value;
        }
    }

    public static void insert18(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 1; i < source.length; i++) {
            printOut(source);
            int key = source[i];
            int priorIndex = i - 1;
            while(priorIndex >= 0 &&
                    source[priorIndex] > key){
                source[priorIndex + 1] = source[priorIndex];
                priorIndex--;
            }
            source[priorIndex + 1] = key;
        }
    }

    public static void insert19(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 1; i < source.length; i++) {
            printOut(source);
            int key = source[i];
            int j = i;
            for (; j > 0 && source[j - 1] > key ; j--) {
                source[j] = source[j - 1];
            }
            source[j] = key;
        }
    }

    public static void insert20(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = source.length - 2; i >= 0; i--) {
            printOut(source);
            int value  = source[i];
            int j = i + 1;
            for (; j <= source.length - 1; j++) {
                if(source[j] < value){
                    source[j - 1] = source[j];
                }else{
                    break; //如果for循环不比较参数那么条件判断是必须要加上break，阻止j++
                }
            }
            source[j - 1] = value; //此时使用source[j]就会容易出现IndexOutOfRangeException..
        }
    }

    public static void insert21(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 1; i < source.length; i++) {
            printOut(source);
            int key = source[i];
            int j = i - 1;
            for (; j >= 0 && source[j] > key ; j--) {
                source[j + 1] = source[j];
            }
            source[j + 1] = key;
        }
    }

    public static void insert22(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i; j - 1 >= 0 && array[j - 1] > key ; j--) {
                array[j] = array[j - 1];
            }
            array[j] = key;
            if(i < array.length - 1) {
                printOut(array);
            }
        }
    }

    public static void insert23(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            printOut(array);
            boolean isSwap = false;
            while(j >= 0 && array[j] > tmp){
                array[j + 1] = array[j];
                isSwap = true;
                j--;
            }
            if(isSwap) {
                array[j + 1] = tmp;
            }
        }
    }

    public static void insert24(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int tmp = array[i];
            int j ;
            for ( j = i - 1;j >= 0 && array[j] > tmp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
    }

    public static void insert25(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 1; i < source.length; i++) {
            int value = source[i];
            int j;
            printOut(source);
            for (j = i - 1; j >= 0 && source[j] > value ; j--) {
                source[j + 1] = source[j];
            }
            source[j + 1] = value;
        }
    }

    public static void insert26(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        int i = 1;
        while(i<array.length){
            int value = array[i];
            int j = i;
            printOut(array);
            while(j > 0 && array[j - 1] > value){
                array[j] = array[j - 1];
                j--;
            }
            if(j != i) {
                array[j] = value;
            }
            i++;
        }
    }

    public static void insert27(int[] array){
        if(array == null){
            return;
        }
        for (int i = array.length - 1; i >= 0 ; i--) {
            int value = array[i];
            int j;
            printOut(array);
            for (j = i + 1; j <= array.length - 1 && array[j] < value; j++) {
                array[j - 1] = array[j];
            }
            array[j - 1] = value;
        }
    }

    public static void insert28(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        int i = 0;
        while(i < array.length){
            int value = array[i];
            int j = i;
            printOut(array);
            while(j > 0){
                if(array[j - 1] > value){
                    array[j] = array[j - 1];
                    j--;
                }else{
                    break;
                }
            }
            if(j != i) {
                array[j] = value;
            }
            i++;
        }
    }

    public static void insert29(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 0; i < source.length; i++) {
            int value = source[i];
            int j = i;
            printOut(source);
            for (j = i; j > 0 ; j--) {
                if(source[j - 1] > value){
                    source[j] = source[j - 1];
                }else{
                    break;
                }
            }
            source[j] = value;
        }
    }

    public static void insert30(int[] source){
        if(source == null){
            return;
        }
        for(int i = 0; i < source.length; i++){
            int value = source[i];
            int j = i;
            printOut(source);
            for (; j > 0 ; j--) {
                if(source[j - 1] > value){
                    source[j] = source[j - 1];
                }else{
                    break;
                }
            }
            source[j] = value;
        }
    }

    public static void insert31(int[] array){
        if(array == null){
            return;
        }
        int i = 0;
        do{
            printOut(array);
            int value = array[i];
            int key = i;
            boolean isSwap = false;
            while(key > 0 && array[key - 1] > value){
                array[key] = array[key - 1];
                key--;

                isSwap = true;
            }
            array[key] = value;
            if(isSwap){
            //    printOut(array);
            }
            i++;
        }while(i < array.length);
    }

    public static void insert32(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            boolean isSwap = false;
            printOut(array);
            for(; j >= 0 && array[j] > tmp; j--){ //判断 '=' 很重要
                array[j + 1] = array[j];
                isSwap = true;
            }
            if(isSwap) {
                array[j + 1] = tmp;
            }
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
