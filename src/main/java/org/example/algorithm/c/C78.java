package org.example.algorithm.c;

/**
 *  判断两个字符是否互为旋转词
 *
 *  如果一个字符串为str，把字符串str前面任意的部分挪到后面形成的字符串叫作str的旋转词。比如str="12345"，str
 *  的旋转词有"12345"、"23451"、"34512"、"45123"和"51234"。给定两个字符串a和b，请判断a和b是否互为旋转词。
 * */
public class C78 {
    public boolean isRotation(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        String c = String.format("%s%s", a, b);
        return c.contains(a);
    }
}
