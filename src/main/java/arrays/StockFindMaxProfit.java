package arrays;

public class StockFindMaxProfit {

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(findMaxProfit(prices));
    }

    public static int findMaxProfit(int[] prices) {

        int maxProfit = 0;
        int left = 0, right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                if (prices[left] > prices[right]) {
                    left = right;
                }
            }
            right++;
        }
        return maxProfit;
    }
}