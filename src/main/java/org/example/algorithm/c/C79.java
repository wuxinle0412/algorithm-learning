package org.example.algorithm.c;

/**
 * 将整数字符串转成整数值
 *
 * 给定一个字符串str，如果str符合日常书写的整数形式，并且属于32位整数的范围，返回str所代表的整数值，
 * 否则返回0。
 * */
public class C79 {
    public int convert(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }

        char[] chas = str.toCharArray();
        if (!isValid(chas)) {
            return 0;
        }
        boolean position = chas[0] != '-';
        int minq =  Integer.MIN_VALUE;
        int minr = Integer.MIN_VALUE % 10;
        int res = 0;
        int cur = 0;
        for (int i = position ? 0 : 1; i < chas.length; i++) {
            cur = '0' - chas[i];
            if ((res < minq) || (res == minq && cur < minr)) {
                return 0;
            }
            res = res * 10 + cur;
        }
        if (position && res == Integer.MIN_VALUE) {
            return 0;
        }

        return position ? -res : res;
    }

    public boolean isValid(char[] chas) {
        if (chas[0] != '-' && chas[0] < '0' || chas[0] > '9') {
            return false;
        }
        if (chas[0] == '-' && (chas.length == 1 || chas[1] == '0')) {
            return false;
        }
        if (chas[0] == '0' && chas.length > 1) {
            return false;
        }
        for (int i = 1; i < chas.length; i++) {
            if (chas[i] < '0' || chas[i] > '9') {
                return false;
            }
        }

        return true;
    }
}
