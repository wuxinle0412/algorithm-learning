package org.example.algorithm.c;

import java.util.Stack;

/**
 * 由两个栈组成的队列
 * */
public class C2 {

}

class TwoStackQueue {
    private Stack<Integer> pushStack = new Stack<>();
    private Stack<Integer> popStack = new Stack<>();

    public void enQueue(int data) {

    }

    public int deQueue() {
        return 0;
    }


    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}