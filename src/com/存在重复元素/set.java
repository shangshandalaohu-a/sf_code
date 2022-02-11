package com.存在重复元素;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 4, 5, 6, 7}));


    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}