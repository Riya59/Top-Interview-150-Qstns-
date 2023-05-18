class Solution {
    public int maxArea(int[] height) {
       
        
        int l = 0;
        int n = height.length;
        int r = n - 1;
        int max = 0;
        while(l < r){
            int lh = height[l];
            int rh = height[r];
            int min = Math.min(lh, rh);
            int length =r-l;
            int curr_area = min * length;
            max = Math.max(max, curr_area);
            if(lh < rh){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
