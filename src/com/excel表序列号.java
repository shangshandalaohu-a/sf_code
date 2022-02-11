package com;

public class excel表序列号 {
    public static void main(String[] args) {
        System.out.println(method(26));
    }


    public static String method(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            number--;
            sb.append((char) (number % 26 + 'A'));
            number /= 26;
        }
        sb.reverse();

        return sb.toString();
    }
}
