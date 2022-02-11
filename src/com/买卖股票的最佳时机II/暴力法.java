package com.买卖股票的最佳时机II;

public class 暴力法 {
    public static void main(String[] args) {
        //[7,1,5,3,6,4]     7
        int i = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);

    }

    public static int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }


}
