class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(ratings == null || n == 0){
            return 0;
        }
        int candies[] = new int[n];
        candies[0] = 1;
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }
            else{
                candies[i] = 1;
            }
        }

        int result = candies[n-1];

        for(int i=n-2; i>=0; i--){
            int curr = 1;
            if(ratings[i] > ratings[i+1]){
                curr = candies[i+1]+1;
            }
            result = result+Math.max(curr, candies[i]);
            candies[i] = curr;
        }

        return result;
    }
}
