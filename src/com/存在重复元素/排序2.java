package com.存在重复元素;

import java.util.Arrays;

public class 排序2 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 4, 5, 1, 6, 7}));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

}
