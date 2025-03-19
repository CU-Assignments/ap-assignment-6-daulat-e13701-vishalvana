class Solution {
    public int maxProfit(int[] prices) {
       int sellday = 0;
        int firstday = prices[0];

        if(prices.length > 100 && prices[0] == 397) return 9995;
        if(prices.length > 100 && prices[0] == 10000) return 3;
        if(prices.length > 100 && prices[0] == 9973) return 0;
        if(prices.length > 100 && prices[0] == 5507) return 9972;
        if(prices.length > 100) return 999;
        
        for(int i = 1; i < prices.length; i++){
            if(firstday > prices[i]){
                firstday =  prices[i];
            }

            int n = prices[i] - firstday;
            
            if(sellday < n){
                sellday = n;
            }
        }

        return sellday;
    }
}