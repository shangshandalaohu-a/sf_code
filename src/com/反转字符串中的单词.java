package com;

public class 反转字符串中的单词 {


    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String s1 = reverseWords(s);
        System.out.println(s1);

    }

    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            char[] chars = s1[i].toCharArray();
            reverseString(chars);
            s1[i] = String.valueOf(chars);

        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s1.length; i++) {
            sb.append(s1[i] + " ");
        }

        // String  s = new String();
        return sb.toString();
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
