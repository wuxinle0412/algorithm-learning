package org.example.algorithm.c;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/8/9 17:53
 *
 * 分别用递归和非递归方式实现二叉树先序、中序和后序遍历
 */
public class C32 {

    public void preOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
}
