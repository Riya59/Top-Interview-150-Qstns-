class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int ind = 1;
        int count = 0;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count=0;
            }
             if(count <= 1){
            nums[ind] = nums[i];
            ind++;
        }
        }
       
        return ind;
    }
}
