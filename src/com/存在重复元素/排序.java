package com.存在重复元素;

public class 排序 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 4, 5, 6, 7}));

    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
