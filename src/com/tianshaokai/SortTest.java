package com.tianshaokai;

public class SortTest {


    public static void main(String[] args) {

        int[] array = {1, 3, 4, 2, 0, 7, 6, 5, 8, 9, 10};
//        int[] array = {4,2,8,9,5,7,6,1,3};


        //未排序数组顺序为
//        System.out.println("未排序数组顺序为：");
//        display(array);
//        System.out.println("-----------------------");
//        array = maoPaoSort(array);
//        System.out.println("-----------------------");
//        System.out.println("经过冒泡排序后的数组顺序为：");
//        display(array);



        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = xuanZeSort(array);
        System.out.println("-----------------------");
        System.out.println("经过选择排序后的数组顺序为：");
        display(array);
    }

    /**
     * 冒泡排序
     * 原理就是每个数做比较，如果左边的数，比右边的数大，就交换位置
     * @param array
     */
    public static int[] maoPaoSort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            boolean flag = true;

            for (int j = 0; j < array.length - i; j++) {

                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                    flag = false;
                }
            }
            //倒序循环
//            for (int j = array.length - 1; j > i; j--) {
//
//                if (array[j] < array[j - 1]) {
//                    int temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//                }
//            }

            if (flag) {
                break;
            }
            //第 i轮排序的结果为
            System.out.print("第" + i + "轮排序后的结果为:");
            display(array);
        }

        return array;

    }

    /**
     * 选择排序
     * @param array
     * @return
     */
    private static int[] xuanZeSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];

                array[minIndex] = tmp;
            }

            System.out.print("第" + (i + 1) + "轮排序后的结果为:");
            display(array);
        }

        return array;
    }


    //遍历显示数组
    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
