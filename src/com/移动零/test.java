package com.移动零;

public class test {
    public static void main(String[] args) {
        int[] num = {0, 2, 0, 3, 5, 6};
        //2,3,5,6,0,0
        moveZeroes(num);
        for (int i : num) {
            System.out.println(i);
        }
    }


    public static void moveZeroes(int[] nums) {
        int FindNotZero = 0;
        int Move = 0;
        while (nums.length > Move) {
            if (nums[Move] != 0) {
                resv(nums, FindNotZero, Move);
                FindNotZero++;
                Move++;
            } else {
                Move++;
            }
        }


    }

    public static void resv(int[] nums, int r, int l) {
        int tem = nums[r];
        nums[r] = nums[l];
        nums[l] = tem;
    }

}
