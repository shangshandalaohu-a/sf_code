package com.爬楼梯;

public class 暴力法 {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        /**
         case 1: result = 1; break;
         case 2: result = 2; break;
         case 3: result = 3; break;
         case 4: result = 5; break;
         case 5: result = 8; break;
         case 6: result = 13; break;
         case 7: result = 21; break;
         case 8: result = 34; break;
         case 9: result = 55; break;
         */
    }

    //1 1 2 3 5
    public static int climbStairs(int n) {
        int[] temp = new int[n + 1];
        temp[0] = 1;
        temp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];

    }

}
