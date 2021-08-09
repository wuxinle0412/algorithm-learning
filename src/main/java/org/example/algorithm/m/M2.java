package org.example.algorithm.m;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/6/18 16:13
 *
 * 两数相加
 *
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 */
public class M2 {

    public static void main(String[] args) {
        M2 m2 = new M2();
        m2.test();
    }

    public void test() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(7);

        ListNode r1 = new ListNode(7);
        ListNode r2 = new ListNode(8);
        ListNode r3 = new ListNode(9);
        ListNode r4 = new ListNode(7);

        l1.next = l2;
        l2.next = l3;

        r1.next = r2;
        r2.next = r3;
        r3.next = r4;

        ListNode result = addTwoNumbers(l1, r1);

        System.out.print("result: ");
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = new ListNode(-1);
        int tmp = 0;

        ListNode n2 = n1;
        while (l1 != null && l2 != null) {
            int result = (tmp + l1.val + l2.val) % 10;
            tmp = (tmp + l1.val + l2.val) / 10;
            ListNode n3 = new ListNode(result);
            n2.next = n3;
            n2 = n3;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int result = (tmp + l1.val) % 10;
            tmp = (tmp + l1.val) / 10;
            ListNode n3 = new ListNode(result);
            n2.next = n3;
            n2 = n3;
            l1 = l1.next;
        }

        while (l2 != null) {
            int result = (tmp + l2.val) % 10;
            tmp = (tmp + l2.val) / 10;
            ListNode n3 = new ListNode(result);
            n2.next = n3;
            n2 = n3;
            l2 = l2.next;
        }

        return n1.next;
    }

    class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
