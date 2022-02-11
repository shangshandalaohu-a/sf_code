package com.旋转数组;

public class 暴力 {
    public static void main(String[] args) {
        int[] a = {3, -5, 2, 6};
        int[] reint = reint(a, 2);
        for (int i : reint) {
            System.out.println(i);
        }
    }


    public static int[] reint(int nums[], int target) {


        int len = nums.length;
        int temp[] = new int[nums.length];

        for (int i = 0; i < len; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[(i + target) % len] = temp[i];
        }

        return nums;
    }

}
