package 简单.数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 存在重复元素 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set);
    }


    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        boolean flag=true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
               // flag=false;
                return true;
            }
        }
        return false;


        //解法二
    /*        Set<Integer> set = new HashSet<>();
            for(int i :nums){
                if (!set.add(i)){
                    return true;
                }
            }
            return false;*/


        //解法一       超时
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                 if (nums[i]==nums[j]){
                     return true;
                 }
            }
        }
        return false;*/
    }
}
