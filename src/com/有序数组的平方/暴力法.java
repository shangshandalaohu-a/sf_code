package com.有序数组的平方;

public class 暴力法 {

    public static void main(String[] args) {
        int nums[] = {0, 43, -46, -35, -2, -1, -3, 9, -4, 5};
        int[] ints = sortedSquares(nums);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }
        return nums;


    }

    /*
          for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>nums[i+1]){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        return nums;

     */
}

