package com;

public class 跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = {2,3,0,1};
        System.out.println(canJump(nums));
    }

    //num[2,3,3,0,4,1]
    public static boolean canJump(int[] nums) {

        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;

    }

}
