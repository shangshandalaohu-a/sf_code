package com.有序数组的平方;

public class 双指针 {
    public static void main(String[] args) {
        int[] ints = {-6, -5, -4, -3, -2};
        int[] ints1 = sortedSquares(ints);
        for (int i : ints1) {
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];

        int write = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[write] = nums[left] * nums[left];
                write--;
                left++;

            } else {
                result[write] = nums[right] * nums[right];
                write--;
                right--;
            }
        }
        return result;
    }
}
