package com.dettol.utils;

public class TestUtils {

    public static void main(String[] args) {
        int[] array = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        int[] array2 = {99, 88, 77, 66, 55, 44, 33, 22, 11,7,5,7,8,3,2,5,8,6,1,4,10};
        int[] array3 = {99, 88, 77, 66, 55, 44, 33, 22, 2,5,3,4,5,6,7,8,2,1,9,0};
        //printOut(array); //OPEN FOR #insert
        //insert(array); //OPEN FOR #insert
        //insert2(array2); //OPEN FOR #insert2
//        printOut(array3); //OPEN FOR #insert2
        insert98(array3);
        printOut(array3); //OPEN FOR #insert3
//        printOut(array3); //OPEN FOR #insert3
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
            int j;
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

    public static void insert33(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i <= array.length - 1; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if(array[j] > value){
                    array[j + 1] = array[j];
                }else{
                    break; // stop j-- once again
                }
            }
            array[j + 1] = value;
            printOut(array); //don't need printOut again
        }
    }

    public static void insert34(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int j = i - 1;
            int value = array[i]; //以array[i]作为一轮比较标记
            for ( ;j >= 0 && array[j] > value ; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = value;
        }
    }

    public static void insert35(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            printOut(array);
            int value = array[i];
            int j = i;
            for (; j > 0 && array[j - 1] > value ; j--) {
                array[j] = array[j - 1];
            }
            array[j] = value;
        }
    }

    public static void insert36(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int key = array[i];
            int j = i;
            while(j > 0 && array[j - 1] > key){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }
    }

    public static void insert37(int[] source){
        if(source == null){
            return;
        }
        for (int i = 1; i < source.length; i++) {
            int value = source[i];
            printOut(source);
            int j;
            for (j = i; j > 0 && source[j - 1] > value ; j--) {
                source[j] = source[j - 1];
            }
            source[j] = value;
        }
    }

    public static void insert38(int[] source){
        if(source == null){
            return;
        }
        int i,j;
        i = 1;
        while(i < source.length){
            j = i;
            printOut(source);
            int value = source[i];
            while(j > 0 && source[j - 1] > value){
                source[j] = source[j - 1];
                j--;
            }
            source[j] = value;
            i++;
        }
    }

    public static void insert39(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int value = array[i];
            int j = i - 1;
            int tmp = array[j];
            boolean isSwap = false;
            for (; j >= 0 && array[j] > value ; j--) {
                isSwap = true;
                if(j + 1 == i){
                    continue;
                }
                array[j + 1] = array[j];
            }
            if(isSwap) {
                array[i] = tmp;
                array[j + 1] = value;
            }
        }
    }

    public static void insert40(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            printOut(array);
            for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) { //此处array[j]作为value 一个一个与后一个比较位置插入
                array[j] = array[j - 1];
                array[j - 1] = value; //这里一定要是value(或者传载value的array[j])
            }
        }
    }

    public static void insert41(int[] array){
        if(array == null){
            return;
        }
        int i = 1;
        while(i < array.length){
            int key = i - 1;
            printOut(array);
            int temp = array[i];
            while(key >= 0 && array[key] > array[key + 1]){
                array[key + 1] = array[key];
                array[key] = temp;
                key--;
            }
            i++;
        }
    }

    public static void insert42(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if(i != 0) {
                printOut(array);
            }
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
            }
        }
    }

    public static void insert43(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i;
            while(j > 0){
                if(array[j - 1] > key){
                    array[j] = array[j - 1];
                }else{
                    break;
                }
                j--;
            }
            if(j != i) {
                array[j] = key;
            }
            printOut(array); //completed
        }
    }

    public static void insert44(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int value = array[i];
            boolean isSwap = false;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j--]; //省代码行写法,可读性很差
                isSwap = true;
                //j--;
            }
            if(isSwap) {
                array[j + 1] = value;
            }
            printOut(array); //completed
        }
    }

    public static void insert45(int[] source){
        if(source == null){
            return;
        }
        for (int i = 0; i < source.length ; i++) {
            int key = source[i];
            int j = i;
            for ( ;j > 0 && source[j - 1] > key; j--){
                if(j == i){
                    printOut(source);
                }
                source[j] = source[j - 1];
            }
            source[j] = key;
        }
    }

    public static void insert46(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for (int i = 0; i < source.length; i++) {
            int key = i;
            int value = source[i];
            for (int j = i; j > 0 && source[j - 1] > value ; j--) { // 如果一直比较的是source[j], 不是value,这里要交换,否则容易成为冒泡排序,还是劣质版那种
                source[j] = source[j - 1];
                key = j - 1;
            }
           if(key < i) {
               source[key] = value;
           }
           if(i < source.length - 1) {
               printOut(source); // 使用value比较会多遍历第一行
           }
        }
    }

    public static void insert47(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }
            if(i < array.length - 1) {
                printOut(array);
            }
        }
    }

    public static void insert48(int[] source){
        if(source == null){
            return;
        }
        printOut(source);
        for (int i = 1; i < source.length; i++) {
            int value = source[i];
            int j;
            for (j = i - 1; j >= 0 && source[j] > value; j--) {
                source[j + 1] = source[j];
            }
            source[j + 1] = value;
            printOut(source); //completed
        }
    }

    public static void insert49(int[] source){
        if(source == null){
            return;
        }
        for (int i = 0; i < source.length; i++) {
            for (int j = i; j > 0 && source[j - 1] > source[j] ; j--) {
                int temp = source[j - 1];
                source[j - 1] = source[j];
                source[j] = temp;
            }
            printOut(source);//completed
        }
    }

    public static void insert50(int[] source){
        if(source == null){
            return;
        }
        for (int i = 2; i < source.length - 2; i++) { //假设i=2不能变, i < source.length - 2不能变
            int j = i - 2;
            for (; j > 0 && source[j - 1] > source[j] ; j--) {
                //if(i == 2 ){
                //    printOut(source);
                // }
                int value = source[j - 1];
                source[j - 1] = source[j];
                source[j] = value;
                if(i >= source.length - 3){
                    int key = 0;
                    while(key < 4) { //因为i前后总共差了4次
                        for (int  k = i - 1; k > 0 && source[k - 1] > source[k]; k--) {
                            int tmp = source[k - 1];
                            source[k - 1] = source[k];
                            source[k] = tmp;
                        }
                        printOut(source);
                        key++;
                        i++;
                    }
                    return; //completed
                }
            }
            printOut(source);
        }
    }

    public static void insert51(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i <= array.length - 1; i++) {
            int value = array[i];
            int j;
            for (j = i; j > 0 ; j--) {
                if(array[j - 1] > value){ // 注意:与array[j]仅出现于即时交换的情况，最好都用value代替，这样就不容易漏看
                    array[j] = array[j - 1];
                }else{
                    break;
                }
            }
            array[j] = value;
            printOut(array); //completed
        }

    }

    public static void insert52(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > value ; j--) {
                array[j] = array[j - 1];
            }
            array[j] = value;
            printOut(array);
        }
    }

    public static void insert53(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }
            printOut(array); //cpmpleted
        }
    }

    private static void insert54(int[] array){
        if(array == null){
            return;
        }
        int i = 0;
        while(i++ < array.length - 1){
            printOut(array);
            int j = i;
            int value = array[i];
            while(j > 0 && array[j - 1] > value){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
        }
    }

    private static void insert55(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            printOut(array);
            int j = i - 1;
            while (j >= 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }

    private static void insert56(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }
            printOut(array); // completed
        }
    }

    private static void insert57(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            printOut(array);
            int j;
            for (j = i - 1; j >= 0 && array[j] > value; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = value;
        }
    }

    private static void insert58(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            for (int j = i; j > 0 ; j--) {
                if(array[j - 1] > value){
                    int temp =  array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            printOut(array);
        }
    }

    private static void insert59(int[] array){
        if(array == null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int j;
            printOut(array);
            int value = array[i];
            for (j = i; j > 0 ; j--) {
                if(array[j - 1] > value){
                    array[j] = array[j - 1];
                }else{
                    break;
                }
            }
            array[j] = value;
        }
    }

    private static void insert60(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }
            printOut(array);
        }
    }

    private static void insert61(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            int value = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > value ; j--) {
                array[j] = array[j - 1];
            }
            array[j] = value;
        }
    }

    private static void insert62(int[] array){
        if(array != null){
            for (int i = 0; i <= array.length - 1 ; i++) {
                int value = array[i];
                int key;
                for (int j = i; (key = j) > 0 && array[j - 1] > value; j--) {
                    array[j] = array[j - 1];
                }
                array[key] = value;
                printOut(array);
            }
        }
    }

    private static void insert63(int[] array){
        if(array != null){
            for (int i = 1; i < array.length; i++) {
                printOut(array);
                for (int j = i - 1; j >= 0 && array[j] > array[j + 1] ; j--) {
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
            }
        }
    }

    private static void insert64(int[] array){
        if(array != null){
            for (int i = 0; i < array.length ; i++) {
                int value = array[i];
                int j;
                for (j = i - 1; j >= 0 ; j--) {
                    if(array[j] > value){
                        array[j + 1] = array[j];
                    }else {
                        break;
                    }
                }
                array[j + 1] = value;
                printOut(array);
            }
        }
    }
    
    private static void insert65(int[] array){
        if(array != null){
            int i , j;
            for (i = 0; i < array.length; i++){
                j = i - 1;
                boolean isSwap = false;
                int tmp = array[i];
                while(j >= 0 && array[j] > tmp){
                    array[j + 1] = array[j];
                    isSwap = true;
                    j--;
                }
                if (isSwap){
                    array[j + 1] = tmp;
                }
                printOut(array);
            }
        }
    }
    
    private static void insert66(int[] array){
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if(array[j - 1] > array[j]){
                        int tmp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp;
                    }else{
                        break;
                    }
                }
                printOut(array);
            }
        }
    }

    private static void insert67(int[] array){
        if(array != null){
            for (int i = 1; i < array.length; i++) {
                printOut(array);
                for (int j = i - 1; j >= 0 && array[j] > array[j + 1] ; j--) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    private static void insert68(int[] array){
        if(array != null){
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                int j = i - 1;
                if(i > 0) {
                    printOut(array);
                }
                while (j >= 0 && array[j] > value) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = value;
            }
        }
    }

    private static void insert69(int[] array){
        if(array != null){
            for (int i = 2; i < array.length ; i++) {
                if(i <= 2 && array[0] > array[1]){
                    int tmp = array[1];
                    array[1] = array[0];
                    array[0] = tmp;
                }
                printOut(array);
                for (int j = i - 1; j >= 0 && array[j] > array[j + 1] ; j--) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    private static void insert70(int[] array){
        if(array != null && array.length != 0){
            for (int i = 1; i < array.length; i++) {
                int value = array[i];
                boolean isSwap = false;
                int j;
                for (j = i - 1; j >= 0 && array[j] > value ; j--) {
                    array[j + 1] = array[j];
                    isSwap = true;
                }
                if(isSwap){
                    array[j + 1] = value;
                    printOut(array);
                }
            }
        }
    }

    private static void insert71(int[] source){
        if(source != null && source.length != 0){
            for (int i = 0; i < source.length ; i++) {
                for (int j = i; j > 0 && source[j - 1] > source[j] ; j--) {
                    int value = source[j];
                    source[j] = source[j - 1];
                    source[j - 1] = value;
                }
                printOut(source);
            }
        }
    }

    private static void insert72(int[] array) {
        if (array != null && array.length > 0) {
            for (int i = 1; i < array.length; i++) {
                printOut(array);
                for (int j = i; j > 0; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private static void insert73(int[] array) {
        if(array != null && array.length > 0){
            for(int i = 1; i < array.length; i++){
                int value = array[i];
                int j = i - 1;
                while(j >= 0){
                    if(array[j] > value){
                        array[j + 1] = array[j];
                        j--;
                    }else{
                        break;
                    }
                }
                array[j + 1] = value;
                printOut(array);
            }
        }
    }

    private static void insert74(int[] array){
        if(array == null){
            return;
        }
        for (int i = 3; i < array.length; i++) {
            printOut(array);
            for (int j = i - 3; j >= 0 && array[j] > array[j + 1]; j--) {
                int value = array[j];
                array[j] = array[j + 1];
                array[j + 1] = value;
            }
            if(i == array.length - 1){
                for (int j = i - 2; j < i; j++) {
                    int k = j;
                    while(k >= 0 && array[k] > array[k + 1]) {
                        int value = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = value;
                        k--;
                    }
                    printOut(array);
                }
            }
        }
    }

    private static void insert75(int[] array){
        int i = 0;
        while(array != null && i < array.length){
            int j = i;
            while(j > 0 && array[j - 1] > array[j]){
                int value = array[j - 1];
                array[j - 1] = array[j];
                array[j] = value;
                j--;
            }
            i++;
            printOut(array);
        }
    }

    private static void insert76(int[] array){
        int i = 1;
        while(array != null && i < array.length){
            printOut(array);
            for (int j = i - 1; j >= 0 && array[j] > array[j + 1] ; j--) {
                int value = array[j];
                array[j] = array[j + 1];
                array[j + 1] = value;
            }
            i++;
        }
        printOut(array);
    }

    private static void insert77(int[] array){
        int i = 1;
        while(array != null && i < array.length){
            int j = i - 1;
            int value = array[i];
            while(j >= 0 && array[j] > value){
                array[j + 1] = array[j];
                j--;
            }
            if(j < i - 1) {
                array[j + 1] = value;
            }
            printOut(array);
            i++;
        }
    }

    private static void insert78(int[] array){
        if(array == null){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            printOut(array);
            for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }
        }
    }

    private static void insert79(int[] array){
        if(array != null && array.length > 0){
            for (int i = 0; i < array.length ; i++) {
                int j = i - 1;
                int value = array[i];
//                while(j >= 0){
                while(!(j < 0)){
                    if(array[j] > value){
                        array[j + 1] = array[j];
                        j--;
                    }else{
                        break;
                    }
                }
                array[j + 1] = value;
                printOut(array);
            }
        }
    }

    private static void insert80(int[] array){
        if( array != null && array.length > 0){
            int i = 1;
            while(i < array.length){
                int j = i++;
                while(j > 0 && array[j - 1] > array[j]){
                    int value = array[j];
                    array[j] = array[j - 1];
                    array[j-- - 1] = value;
                }
                printOut(array);
            }
        }
    }

    private static void insert81(int[] array){
        if(array != null && array.length > 0){
            for (int i = 2; i < array.length; i++) {
                int j = i - 2;
                printOut(array);
                int value = array[j + 1];
                while(j >= 0 && array[j] > value){
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = value;
            }
            for (int i = array.length - 1; i < array.length ; i++) {
                int j = i - 1; 
                printOut(array);
                int value = array[j + 1];
                while(j >= 0 && array[j] > value){
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = value;
            }
        }
    }

    private static void insert82(int[] array){
        if(array != null && array.length > 1){
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > value){
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = value;
                printOut(array);
            }
        }
    }

    private static void insert83(int[] array){
        if(array != null){
            int i = 0, j;
            while(i < array.length){
                int value = array[i];
                j = i - 1; //j初始值随时变动，不能放循环外层，且其值至少有少于i的机会
                while(j >= 0 && array[j] > value){
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = value;
                printOut(array);
                i++;
            }
        }
    }

    private static void insert84(int[] array){
        if(array != null){
            int i = 1, j;
            while(i < array.length){
                printOut(array);
                int value = array[i];
                j = i - 1;
                while(j >= 0 && array[j] > value){
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = value;
                i++;
            }
        }
    }

    private static void insert85(int[] array){
        if(array != null && array.length > 1){
            for (int i = 1; i < array.length; i++) {
                printOut(array);
                int j = i;
                int value = array[i];
                for (;j > 0 && array[j - 1] > value;j--){
                    array[j] = array[j - 1];
                }
                array[j] = value;
            }
        }
    }

    private static void insert86(int[] array){
        if(array != null && array.length > 1){
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                    int value = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = value;
                }
                printOut(array);
            }
        }
    }

    private static void insert87(int[] source){
        if(source != null && source.length > 1){
            for (int i = 0; i < source.length; i++) {
                for (int j = i; j > 0 && source[j - 1] > source[j] ; j--) {
                    int value = source[j];
                    source[j] = source[j - 1];
                    source[j - 1] = value;
                }
                printOut(source);
            }
        }
    }

    private static void insert88(int[] array){
        if(array != null){
            for (int i = 0; i < array.length; i++) {
              int value = array[i];
              int j = i - 1;
              while(!(j < 0) && array[j] > value){
                  array[j + 1] = array[j];
                  j--;
              }
              array[j + 1] = value;
              printOut(array);
            }
        }
    }

    private static void insert89(int[] array){
        int i = 0;
        while(array != null && ++i < array.length){
            printOut(array);
            for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }
        }
    }

    private static void insert90(int[] array){
        if(array != null){
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                    int value = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = value;
                }
                printOut(array);
            }
        }
    }

    private static void insert91(int[] array){
        int i = 0, j;
        while(array != null && ++i < array.length){
            for(j = i;j > 0 && array[j - 1] > array[j];j--){
                int value = array[j];
                array[j] = array[j - 1];
                array[j - 1] = value;
            }
            printOut(array);
        }
    }

    private static void insert92(int[] array){
        if(array != null){
            for (int i = 1; i < array.length; i++) {
                int j = i - 1, value = array[i];
                while(j >= 0 && array[j] > value){ //使用j比较value,如果array[j]>value,那么要移动的应该是array[j]而不是array[j + 1]
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = j + 1 == i ? array[j + 1] : value;
                printOut(array);
            }
        }
    }

    private static void insert93(int[] array){
        if(array != null){
            for (int i = 0; i < array.length; i++) {
                printOut(array);
                for (int j = i; j > 0 && array[j - 1] > array[j] ; j--) {
                    int value = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = value;
                }
            }
        }
    }

    private static void insert94(int[] array){
        if(array != null){
            for (int i = 0, j , value; i < array.length ; i++) {
                j = i;
                value = array[i];
                while(j > 0 && array[j - 1] > value){
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = value;
                printOut(array);
            }
        }
    }

    private static void insert95(int[] array){
        if(array != null){
            for (int i = 0; i < array.length; i++) {
                int j = i - 1;
                while(j >= 0 && array[j] > array[j + 1]){
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j-- + 1] = value;
                }
                printOut(array);
            }
        }
    }
    
    private static void insert96(int[] array){
        if(array == null){
            return;
        }
        int i = 0, j ,value;
        while(i < array.length){
            value = array[i];
            j = i;
            while(j > 0 && array[j - 1] > value){
                array[j] = array[j - 1];
                j--;
            }
            if(j != i) {
                array[j] = value;
            }
            printOut(array);
            i++;
        }
    }

    private static void insert97(int[] array){
        if(array != null){
            int i = 0;
            while(i++ < array.length){
                int j = i - 1;
                printOut(array);
                while(j >= 0 && j < array.length - 1
                        && array[j] > array[j + 1]){
                    int value = array[j + 1];
                    array[j + 1] = array[j];
                    array[j--] = value;
                }
            }
        }
    }

    private static void insert98(int[] array){
        if(array != null && array.length != 0){
            for (int i = 1; i < array.length ; i++) {
                printOut(array);
                int value = array[i];
                int j = i - 1;
                boolean needSwap = false;
                while(j > 0 || j == 0 && array[j] > value){
                    array[j + 1] = array[j];
                    j--;
                    needSwap = true;
                }
                if(needSwap) {
                    array[j + 1] = value;
                }
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
