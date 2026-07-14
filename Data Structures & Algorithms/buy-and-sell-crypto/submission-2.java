class Solution {
    public int maxProfit(int[] prices) {
        int highestProfit = 0;
        int lowerPrice = Integer.MAX_VALUE;

        for(int i=0;i< prices.length; i++){
            if(prices[i] < lowerPrice){
                lowerPrice = Math.min(prices[i],lowerPrice);
            }

            int profit = prices[i] - lowerPrice;

            if(profit > highestProfit){
                highestProfit = profit;
            }
        }

        return highestProfit;
    }
}
