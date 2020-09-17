package LeetCode;

public class maxProfit {

    public static int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // return 6-1 = 5
        int[] prices = {7,1,5,3,6,4};
        int maxSubArray = maxProfit(prices);
        System.out.println(maxSubArray);
    }
}
