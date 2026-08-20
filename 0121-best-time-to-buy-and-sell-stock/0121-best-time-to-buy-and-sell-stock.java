class Solution {
    public int maxProfit(int[] prices) {
        int price = 0;
        int minPrice  = prices[0];
        int profit = 0;

        for(int i =0; i<prices.length; i++){
            price = prices[i];
           
            if(price<minPrice){
                minPrice = price;
            }
            profit = Math.max(profit, price - minPrice);
        }
        return profit;
    }
}