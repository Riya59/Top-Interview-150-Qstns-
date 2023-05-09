class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int include = nums[0];
        int sum = 0;
        int exclude;
        for(int i=1;i<n;i++){
            exclude = Math.max(include, sum);
            include = sum + nums[i];
            sum = exclude;
        }
        return Math.max(include, sum);
    }
}
