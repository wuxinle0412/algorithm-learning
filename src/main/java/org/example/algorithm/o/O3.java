package org.example.algorithm.o;

import java.util.HashSet;
import java.util.Set;

/**
 *  找出数组中重复的数字
 *
 *  在一个长度为n的数组里的所有数字都在0~n-1的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个
 * 重复的数字。例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重
 * 复的数字是2或者3。
 * */
public class O3 {

    /**
     * 哈希表
     * */
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }

        return -1;
    }

    /**
     * 对数字进行排序
     * */
    public int findRepeatNumber2(int[] nums) {
        return -1;
    }

    /**
     *
     * */
    public int findRepeatNumber3(int[] nums) {
        int length = nums.length;
        int i = 0;
        while (i < length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }

        return -1;
    }

}
