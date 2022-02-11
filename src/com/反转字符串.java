package com;

public class 反转字符串 {
    public static void main(String[] args) {
        char[] c = {'a', 'w', 't', 'e', 'j'};
        reverseString(c);
        String c1 ="$wet";
        System.out.println(c);
    }

    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (r > l) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
