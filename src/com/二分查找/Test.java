package com.二分查找;

public class Test {
    public static void main(String[] args) {
        int a[] = {-4, -3, -1, -0, 1, 2, 3};

        //  System.out.println(a.length);
        int search = search(a, 3);
        System.out.println(search);

    }


    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }
}
   /* public static int searchsx(int[] num,int target){
        int nub=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]==target){
                nub=i;
                break;
            }else {
                nub=-1;
            }
        }
        return nub;
    }*/
