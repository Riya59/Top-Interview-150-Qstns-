class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n<=1){
            return 0;
        }
        int maxReach = nums[0];
        int stepCount = nums[0];
        int jump = 0;
        for(int i=1;i<n-1;i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            stepCount = stepCount - 1;
            if(stepCount == 0){
                jump = jump+1;
                stepCount = maxReach - i;
            }
        }
        return jump+1;
    }
}
