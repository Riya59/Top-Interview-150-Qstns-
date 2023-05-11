class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int max_Sum = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            currSum = currSum + nums[i];
            if(currSum > max_Sum){
                max_Sum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
            
        }
        return max_Sum;

    }
}
