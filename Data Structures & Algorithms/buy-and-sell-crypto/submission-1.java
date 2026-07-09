class Solution {
    public int maxProfit(int[] prices) {
        int highestProfit = 0;
        int lowest = Integer.MAX_VALUE;
        // 10,1,5,6,7,1
        for(int i=0;i<prices.length; i++){
            if(prices[i] < lowest){
                lowest = prices[i];
            }
            int profit = prices[i] - lowest;

            if(profit > highestProfit){
                highestProfit = profit;
            }
            
        }
        return highestProfit;
    }
}
