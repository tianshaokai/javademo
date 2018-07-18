package com.tianshaokai;

public class StringDemo {

    public static void main(String[] args) {
        strFanZhuan("321");
    }


    /**
     * 字符串反转
     * @param str
     */
    public static void strFanZhuan(String str) {
        char[] array = str.toCharArray();
        String str1 = "";
        for (int i = array.length - 1; i >= 0; i--) {
            str1 += array[i];
        }

        System.out.println(str1);
    }
}
