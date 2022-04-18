class Solution {
    public int maxProfit(int[] prices) {
        int minValue=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            minValue=Math.min(minValue,prices[i]);       //find the min price at hich you can buy hence min
            profit=Math.max(prices[i]-minValue,profit);   //max becoz we need max profit between current profit and what we get if substract curretn day price with invested value
        }
        return profit;
    }
}
