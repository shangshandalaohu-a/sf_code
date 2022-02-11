package com.搜索插入位置;

public class Test1 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        int i = searchInsert(a, 3);
        System.out.println(i);
    }


    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return 0;
    }
}
