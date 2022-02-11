package com.将整数转换为两个无零整数的和;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        a1[9] = a1[9] + 1;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(getNoZeroIntegers(480820309)));
    }

    //480820309
    public static int[] getNoZeroIntegers(int n) {
        int a = 1;
        int b = n - a;
        while (haveZero(b)) {
            if (a * 10 + 1 < n) {
                a = a * 10 + 1;
                if (a % 10 == 0) {
                    a += 1;
                }
            } else {
                a += 1;
                if (a % 10 == 0) {
                    a += 1;
                }
            }
            b = n - a;
        }
        return new int[]{a, b};
    }

    private static boolean haveZero(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
