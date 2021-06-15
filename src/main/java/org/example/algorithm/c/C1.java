package org.example.algorithm.c;

import java.util.Stack;

/**
 * 设计一个具有getMin功能的栈
 * */
public class C1 {
    public static void main(String[] args) {
        MyStack1 stack1 = new MyStack1();
        stack1.push(2);
        stack1.push(3);
        stack1.push(3);
        stack1.push(1);

        System.out.println(stack1.getMin());
    }
}

class MyStack2 {
    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(int data) {
        if (isEmpty()) {
            stackMin.push(data);
        } else {
            if (data <= stackMin.peek()) {
                stackMin.push(data);
            }
        }
    }

    public int pop() {
        int cur = stackMin.pop();
        if (stackMin.peek() == cur) {
            stackMin.pop();
        }
        return cur;
    }

    public int getMin() {
        return stackMin.peek();
    }

    public boolean isEmpty() {
        return this.stackData.isEmpty();
    }
}

class MyStack1 {
    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(int data) {
        if (isEmpty()) {
            stackMin.push(data);
        } else {
            stackMin.push(stackMin.peek() < data ? stackMin.peek() : data);
        }

        stackData.push(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("your stack is empty.");
        }
        stackMin.pop();
        return stackData.pop();
    }

    public int getMin() {
        return stackMin.peek();
    }

    public int peek() {
        return this.stackData.peek();
    }

    public boolean isEmpty() {
        return this.stackData.isEmpty();
    }
}
