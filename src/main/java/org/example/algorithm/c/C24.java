package org.example.algorithm.c;

import java.util.HashSet;

/**
 * 删除无序链表中值重复出现的节点
 * */
public class C24 {

    /**
     * 利用哈希表。时间复杂度为O(n)，额外空间复杂度为O(n)。
     * */
    public void removeRep1(Node head) {
        if (head == null) {
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        Node pre = head;
        Node cur = head.next;
        while (cur != null) {
            if (set.contains(cur.value)) {
                pre.next = cur.next;
            } else {
                set.add(cur.value);
                pre = cur;
            }
            cur = cur.next;
        }
    }

    /**
     * 遍历法
     * */
    public void removeRep2(Node head) {
        Node cur = head;
        Node pre = null;
        Node next = null;

        while (cur != null) {
            pre = cur;
            next = cur.next;
            while (next != null) {
                if (cur.value == next.value) {
                    pre.next = next.next;
                } else {
                    pre = next;
                }
                next = next.next;
            }
            cur = cur.next;
        }
    }

    class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
}
