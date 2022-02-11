package com.两数相加;

public class test {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7};
        int target = 99;
        // System.out.println(nums.length);
        int[] ints = twoSun(nums, target);
        for (int i : ints)
            System.out.println(i);
    }


    public static int[] twoSun(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }


        return new int[0];
    }
}
