
class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int max = Integer.MAX_VALUE;
       int day = 0;
       int buy = 0;
       for(int i=0;i<n;i++){
           if(prices[i]<max){
             max = prices[i];
           }
           day = prices[i]-max;
           if(buy<day){
               buy = day;
           }
       }
       return buy;
    }
}
