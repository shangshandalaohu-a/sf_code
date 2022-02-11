package com.加一;

import java.util.Arrays;

public class 暴力法 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = new int[10];


        int[] ints = plusOne(new int[]{4, 3, 9, 9});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        for (int i = n; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                for (int j = i + 1; j < n + 1; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        int b[] = new int[n + 1];
        b[0] = 1;
        return b;

    }
}
