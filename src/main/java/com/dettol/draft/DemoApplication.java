package com.dettol.draft;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//  SpringApplication.run(DemoApplication.class, args);
        int[] a = {1234123, 123, 412, 3412, 3412, 34, 12345, 235, 3644, 567, 567, 7, 87, 8, 8, 8, 8, 88, 8, 345, 6, 3456, 345, 6345, 6345};
        int[] b = {22, 11, 33, 44, 55, 66, 1, 0, 77};
        insert2(a);
        for (int ready = 0; ready < a.length; ready++) {
            System.out.print(a[ready] + (ready < a.length - 1 ? "," : ""));
        }
        System.out.println();
//        for (int i : b) {
//            System.out.println(i);
//        }
    }

    public static void insert2(int[] source){
        if(source == null || source.length == 0){
            return;
        }
        for(int i=1; i < source.length; i++){

            for (int ready = 0; ready < source.length; ready++) {
                System.out.print(source[ready] + (ready < source.length - 1 ? "," : ""));
            }
            System.out.println();
            int value = source[i];
            for(int j = i; j > 0; j--){
                if(source[j - 1] > source[j]){
                    value = source[j];
                    source[j] = source[j - 1];
                    source[j - 1] = value;
                } else {
                    break;
                }
            }

        }
    }

    public static void insert1(int[] unsort) {
        if (unsort == null || unsort.length == 0) {
            return;
        }

        for (int i = 1; i < unsort.length; i++) {
            int value = unsort[i];
            int j;
            for (j = i; j > 0 && unsort[j - 1] > value; j--) {
                unsort[j] = unsort[j - 1];
            }
            unsort[j] = value;
        }
    }

    public static void insert(int[] source) {
        if (source == null || source.length == 0) {
            return;
        }

        for (int i = 1; i < source.length; i++) {
            for (int ready = 0; ready < source.length; ready++) {
                System.out.print(source[ready] + (ready < source.length - 1 ? "," : ""));
            }
            System.out.println();

            // 当前位置的值有可能因为插入排序往后移动，被覆盖，先保存
            // 插入排序的特征数，比较的是这个值
            int value = source[i];
            int j;
            // 往有序的方向遍历，待插入的值如果大于最后一个值，马上停止遍历
            // 否则前一个值依次赋值给后一个值
            for (j = i; j > 0 && source[j - 1] > value; j--) {
                source[j] = source[j - 1];
            }
            // 保存下的值，赋值给留下的那个空挡，也是它合理的位置
            source[j] = value;
        }
    }

    public static void bubble(int[] source) {
        for (int i = source.length - 1; i > 0; i--) {
            // 输出冒泡出来的后半部分有序信息
            for (int ready = 0; ready < source.length; ready++) {
                System.out.print(source[ready] + (ready < source.length - 1 ? "," : ""));
            }
            System.out.println();

            // 冒泡的特征数
            boolean isSwap = false;
            for (int j = 0; j < i; j++) {
                if (source[j] > source[j + 1]) {
                    int temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                    isSwap = true;
                }
            }

            if (!isSwap) {
                break;
            }
        }
    }

    public static void insertWhile(int[] source) {
        for (int i = 1; i < source.length; i++) {
            int key = source[i];
            int priorIndex = i - 1;
            while (priorIndex >= 0 && source[priorIndex] > key) {
                source[priorIndex + 1] = source[priorIndex];
                priorIndex--;
            }
            source[priorIndex + 1] = key;
        }
    }

    public static void quick(int[] source, int left, int right) {
        if (source == null || source.length == 0 || left >= right) {
            return;
        }

        int pivot = source[left];
        int leftPointer = left;
        int rightPointer = right;

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && source[rightPointer] >= pivot) {
                rightPointer--;
            }
            swap(source, leftPointer, rightPointer);

            while (leftPointer < rightPointer && source[leftPointer] <= pivot) {
                leftPointer++;
            }
            swap(source, leftPointer, rightPointer);
        }

        quick(source, left, leftPointer - 1);
        quick(source, leftPointer + 1, right);
    }

    private static void swap(int[] source, int pointerLeft, int pointerRight) {
        int temp = source[pointerLeft];
        source[pointerLeft] = source[pointerRight];
        source[pointerRight] = temp;
    }

}