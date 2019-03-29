package com.zz.base.other;


import android.util.Log;

public class Practice {


    public static void demo() {
        // 1. 练习题 {3, 32, 27, 25, 54, 342} 组合排序出最小的数
        int[] demo = new int[]{3, 32, 27, 25, 54, 342};
        // 每一组进行排序  规则：第一位相等 看第二位，第二位小的优先靠前，若第二位没有 则按照前一位大小计算
        int[] sort = sort(demo);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : sort) {
            sb.append(integer);
        }
        Log.i("xx", "最终排序为--" + sb.toString());



    }


    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String s1 = String.valueOf(arr[i]);
                String s2 = String.valueOf(arr[j]);
                for (int k = 0; k < String.valueOf(Math.max(arr[i], arr[j])).length(); k++) {
                    String substring1;
                    String substring2;
                    // 判断如果没有后一位 则取前一位
                    if (k > s1.length() - 1) {
                        substring1 = s1.substring(s1.length() - 1, s1.length());
                    } else {
                        substring1 = s1.substring(k, k + 1);
                    }
                    if (k > s2.length() - 1) {
                        substring2 = s2.substring(s2.length() - 1, s2.length());
                    } else {
                        substring2 = s2.substring(k, k + 1);
                    }
                    if (Integer.parseInt(substring1) > Integer.parseInt(substring2)) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    // 只有在第n位相同才比较下一位，否则一次比较出结果 退出
                    if (Integer.parseInt(substring1) != Integer.parseInt(substring2)) {
                        break;
                    }
                }
            }
        }
        return arr;
    }

}
