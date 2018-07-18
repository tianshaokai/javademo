package com.tianshaokai;

public class StringDemo {

    public static void main(String[] args) {
        System.out.println(strFanZhuan("321"));

        System.out.println(reverseWords("the sky is blue"));
    }


    /**
     * 字符串反转
     * @param str = "321"
     * @return      "123"
     */
    public static String strFanZhuan(String str) {
        char[] array = str.toCharArray();
        String str1 = "";
        for (int i = array.length - 1; i >= 0; i--) {
            str1 += array[i];
        }
        return str1;
    }


    /**
     * 给定一个字符串，逐个翻转字符串中的每个单词。
     * @param s  = "the sky is blue"
     * @return     "blue is sky the"
     */
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; --i) {
            if (!array[i].equals("")) {
                sb.append(array[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
