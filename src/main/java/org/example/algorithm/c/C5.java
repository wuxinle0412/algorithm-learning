package org.example.algorithm.c;

import java.util.Stack;

/**
 *  用一个栈实现另一个栈的排序
 *
 *  一个栈中元素的类型为整型，现在想将该栈从栈顶到底按从大到小的顺序排序，只许申请一个栈。
 *  除此之外，可以申请新的变量，但不能申请额外的数据结。如何完成排序？
 * */
public class C5 {
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
