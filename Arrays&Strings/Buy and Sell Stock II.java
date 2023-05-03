class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int diff = 0;
        int maxprofit = 0;
        int n = prices.length;
        for(int i=0;i<n;i++){
            if(prices[i] - minprice >= diff){
                diff = prices[i] - minprice;
            }
            else{
                minprice = prices[i];
                if(diff>0){
                    maxprofit = maxprofit+diff;
                    diff = 0;
                }
            }
        }
        if(diff > 0){
            maxprofit = maxprofit+diff;
        }
        return maxprofit;
        
    }
}
