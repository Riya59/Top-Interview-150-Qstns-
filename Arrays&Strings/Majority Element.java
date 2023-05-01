class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // int maxcount = 0;
        // int index = -1;
        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > maxcount){
        //         maxcount = count;
        //         index = i;
        //     }
        // }
        // int ans=0;
        // if(maxcount > n/2){
        //     ans = nums[index];
        // }
        // return ans;

        Arrays.sort(nums);
        return nums[n/2];
        
    }
}
