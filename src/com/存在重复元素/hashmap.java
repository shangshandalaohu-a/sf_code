package com.存在重复元素;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 4, 5, 6, 7}));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        System.out.println(map.size());
    }


    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], a++);
        }
        if (map.size() == nums.length) {
            return false;
        }
        return true;
    }
}
