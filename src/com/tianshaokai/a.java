package com.tianshaokai;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class a {

    public static final String Format_Hour_Minute_Second = "HH:mm:ss";

    public static void main(String[] args) {
//        System.out.println(getFormatNumber("3"));
//        System.out.println(getFormatNumber("3.0"));
//        System.out.println(getFormatNumber("3.1"));
//        System.out.println(getFormatNumber("3.5"));
//        System.out.println(getFormatNumber("3.54"));
//        System.out.println(getFormatNumber("3.55"));
//        System.out.println(getFormatNumber("3.56"));

//        System.out.println(getTime(5738114));


//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);
//        list.add(0);
//
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 1;
//            }
//        });
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("3", "3");
        map.put("2", "2");
        map.put("4", "4");

//        for (String key : map.keySet()) {
//            System.out.println("key= "+ key + " and value= " + map.get(key));
//        }
//
//        //第二种
//        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
//        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//        }


//        Map<String, String> hashtable = new Hashtable<>();
//        hashtable.put("1", "1");
//        hashtable.put("3", "3");
//        hashtable.put("2", "2");
//        hashtable.put("4", "4");
//        String value = hashtable.remove("null");
//        System.out.println(value);
        int j = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 3 != 0) { // 如果不能被3 整除
                j ++;
                System.out.println(i);
            }
        }

        System.out.println("不能被3整除的个数：" + j);
    }

    public static String getFormatNumber(String str) {
        try {
            DecimalFormat formater = new DecimalFormat();
            formater.setMaximumFractionDigits(2);
            formater.setGroupingSize(0);
            formater.setRoundingMode(RoundingMode.HALF_UP);
            return formater.format(Double.valueOf(str));
        } catch (NumberFormatException e) {
//            Logger.getLogger().e("数据转换异常: " + e.toString());
        }
        return "0";
    }
    public static String getTime(long time) {
        SimpleDateFormat format = new SimpleDateFormat(Format_Hour_Minute_Second);
        format.setTimeZone(TimeZone.getTimeZone("GMT+08"));
        Date date = new Date(time);
        return format.format(date);
    }

}
