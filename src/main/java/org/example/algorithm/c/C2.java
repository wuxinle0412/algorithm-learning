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

    /**
     * push to pop
     * */
    private void pushToPop() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
    }

    public void push(int data) {
        pushStack.push(data);
        pushToPop();
    }

    public int poll() {
        if (pushStack.isEmpty() && popStack.isEmpty()) {
            throw new RuntimeException("queue is empty!");
        }
        pushToPop();
        return popStack.pop();
    }

    public int peek() {
        if (popStack.isEmpty() && pushStack.isEmpty()) {
            throw new RuntimeException("queue is empty!");
        }
        pushToPop();
        return popStack.peek();
    }

    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}