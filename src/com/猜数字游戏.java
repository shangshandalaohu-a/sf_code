package com;

public class 猜数字游戏 {
    public static void main(String[] args) {
        System.out.println(getHint("1123", "0111"));
    }


    public static String getHint(String secret, String guess) {
        int n = secret.length();
        int a = 0;
        int b = 0;
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        for (int i = 0; i < n; i++) {
            if (secret.charAt(i) - '0' == guess.charAt(i) - '0') {
                a++;
            } else {
                a1[secret.charAt(i) - '0']++;//a1[i]=a[i]+1
                a2[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            b = b + Math.min(a1[i], a2[i]);
        }
        return a + "A" + b + "B";
    }
}
