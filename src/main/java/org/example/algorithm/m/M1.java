package org.example.algorithm.m;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/6/16 17:51
 *
 * 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 */
public class M1 {

    public static void main(String[] args) {
        M1 m1 = new M1();

        int[] nums = new int[] {1, 4, 5, 7, 9};
        int target = 8;
        int[] result = m1.twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    /**
     *  使用哈希表
     * */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            } else {
                int second = target - nums[i];
                map.put(second, i);
            }
        }

        return null;
    }

}
