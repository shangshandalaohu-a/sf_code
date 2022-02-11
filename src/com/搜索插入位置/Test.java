package com.搜索插入位置;

public class Test {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        int i = searchInsert(a, 8);
        System.out.println(i);
    }


    public static int searchInsert(int[] nums, int target) {
        int left = 0;

        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if (target == num) {

                return mid;
            } else if (num < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return left;
    }
}
