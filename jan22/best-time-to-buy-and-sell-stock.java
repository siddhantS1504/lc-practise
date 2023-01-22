
//QUESTION LINK: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int profit = 0, max_prof = 0;
        for(int i=0 ; i<prices.length ; i++){
            min = Math.min(prices[i],min);
            profit = prices[i] - min;
            max_prof = Math.max(profit , max_prof);
        }
        return max_prof;

    }
}
