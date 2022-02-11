package com;

public class 换酒问题 {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
        // 12-5 = 7     12+1 =13   7+1 =8   8-5=3  13+1 = 14
    }


    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int shenxia = numBottles;
        while (shenxia >= numExchange) {
            shenxia = shenxia - numExchange;
            ans++;
            shenxia++;
        }
        return ans;

    }
}
