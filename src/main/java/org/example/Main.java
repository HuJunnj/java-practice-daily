package org.example;

import org.example.Metadata.entity.DateBaseEntity;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(111);
        new Thread(()->{
            System.out.println(222);
        });
        Thread.sleep(1000*2);
        System.out.println("program is over");
        /*int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {1, 2, 3, 4, 5};
        int[] prices2 = {7, 6, 4, 3, 1};
        Main main = new Main();
        int maxProfit = main.maxProfit(prices);
        int maxProfit1 = main.maxProfit(prices1);
        int maxProfit2 = main.maxProfit(prices2);
        System.out.println(maxProfit);
        System.out.println(maxProfit1);
        System.out.println(maxProfit2);*/
    }
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // 边界情况：空数组
        }
        int maxProfit = 0;                // 记录最大利润
        for (int i= 1; i< prices.length; i++) {
            if(prices[i-1]<prices[i]) {
                maxProfit = maxProfit + prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

}