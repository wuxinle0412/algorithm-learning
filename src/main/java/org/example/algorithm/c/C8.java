package org.example.algorithm.c;

import java.util.Stack;

/**
 * 单调栈结构
 *
 * 给定一个不含有重复值的数组arr，找到每一个i位置左边和右边离i位置最近且值比arr[i]小的位置。
 * 返回所有位置相应的信息。
 * */
public class C8 {
    public int[][] getNearLessNoRepeat(int[] arr) {
        int[][] res = new int[arr.length][2];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int pos = stack.pop();
                res[pos][0] = stack.isEmpty() ? -1 : stack.peek();
                res[pos][1] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int pos = stack.peek();
            res[pos][0] = stack.isEmpty() ? -1 : stack.peek();
            res[pos][1] = -1;
        }

        return res;
    }

    public int[][] getNearLess(int[] arr) {
        return null;
    }
}
