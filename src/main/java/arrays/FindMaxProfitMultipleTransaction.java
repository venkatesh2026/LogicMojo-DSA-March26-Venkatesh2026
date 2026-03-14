package arrays;

public class FindMaxProfitMultipleTransaction {

    public static void main(String[] args) {
        int[] prices = {1, 5, 2, 3, 7, 6, 4, 5};
        System.out.println(findMaxProfit(prices));

        System.out.println(findMaxProfitGreedApproach(prices));
    }

    //peak-valley technique ,need to find localMin and localMax in each sub array
    public static int findMaxProfit(int[] prices) {
        int i = 0, profit = 0;

        while (i < prices.length - 1) {

            //find the min element from sub array
            while (i < prices.length - 1 && prices[i] > prices[i + 1]) {
                i++;
            }
            int localMin = prices[i];

            //find the max element from sub array

            while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                i++;
            }
            int localMax = prices[i];

            profit = profit + localMax - localMin;
        }
        return profit;
    }


    //need to write greedy approach ? peak-valley approach failing to complete in time in Leetcode
    public static int findMaxProfitGreedApproach(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}