package com.旋转数组;

public class 多次反转 {
    public static void main(String[] args) {
        int[] nums = {-4, -3, 0, 3, 5, 7, 8};
        med(nums, 7);
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void med(int[] nums, int k) {
        k = k % nums.length;
        resv(nums, 0, nums.length - 1);
        resv(nums, 0, k - 1);
        resv(nums, k, nums.length - 1);
    }

    public static void resv(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }


    }
}
