package org.example.algorithm.c;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/8/9 17:56
 *
 * 二叉树的最小深度
 *
 * 给定一颗二叉树的头节点head，求这棵二叉树的最小深度。
 *
 * 进阶: 请将解法优化到时间复杂度O(N)，额外空间复杂度O(1)
 */
public class C33 {

    public int process(Node cur, int level) {
        if (cur.left == null && cur.right == null) {
            return level;
        }
        int ans = Integer.MAX_VALUE;
        if (cur.left != null) {
            ans = Math.min(process(cur.left, level + 1), ans);
        }
        if (cur.right != null) {
            ans = Math.min(process(cur.right, level + 1), ans);
        }
        return ans;
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
