package org.example.algorithm.c;

import java.util.Stack;

/**
 *  判断一个链表是否未回文结构
 * */
public class C18 {

    public boolean isPalindrome1(Node head) {
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (!stack.isEmpty()) {
            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public boolean isPalindrome2(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node cur = head;
        Node right = head.next;

        //找到中间节点的下一个位置
        while (cur.next != null && cur.next.next != null) {
            right = right.next;
            cur = cur.next.next;
        }

        Stack<Node> stack = new Stack<>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }

        while (!stack.isEmpty()) {
            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    /**
     *  反转右半部分链表
     * */
    public boolean isPalindrome3(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        //查找中间节点下一个节点的话，适用 Node n1 = head.next;
        Node n1 = head;
        Node n2 = head;
        if (n2.next != null && n2.next.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }

        //右半部分第一个节点
        n2 = n1.next;
        //中间节点
        n1.next = null;
        Node n3 = null;
        // 反转右半区
        while (n2 != null) {
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }

        n3 = n1; //原最后一个节点
        n2 = head;

        boolean res = true;
        while (n1 != null && n2 != null) {
            if (n1.value != n2.value) {
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        //将原链表还原
        n1 = n3.next;
        n3.next = null;
        while (n1 != null) {
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return res;
    }

    class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
}
