package com;

public class 回文数 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        String s = "234";
        char[] chars = s.toCharArray();
        byte[] bytes = s.getBytes();
        String s1 = new String(chars);
        String s2 = new String(bytes);
        int i = 343;
        String s3 = Integer.toString(i);
        String s4 = new String(chars);
        String s5 = String.valueOf(chars);


    }


    public static boolean isPalindrome(int x) {

        String s2 = Integer.toString(x);
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        int a = 0;
        char[] temp = new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            temp[i] = chars[a++];
        }
        String s1 = new String(temp);
        if (s1.equals(s)) {
            return true;
        }

        return false;
    }
}
