package org.example.algorithm.c;

import java.util.Locale;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/8/9 18:17
 *
 * 判断两个字符串是否互为变形词
 *
 * 给定两个字符串str1和str2，如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样，那么str1和str2互为变形词。
 * 请实现函数判断两个字符串是否互为变形词。
 */
public class C77 {

    public boolean isDeformation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] map = new int[256];

        for (int i = 0; i < chars1.length; i++) {
            map[chars1[i]]++;
        }

        for (int i = 0; i < chars2.length; i++) {
            if (map[chars2[i]]-- == 0) {
                return false;
            }
        }

        return true;
    }
}
