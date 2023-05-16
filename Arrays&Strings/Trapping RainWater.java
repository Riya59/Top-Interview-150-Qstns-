class Solution {
    public int trap(int[] height) {
        // int n = height.length;
        // int left = 0;
        // int right = n-1;
        // int maxleft = 0; 
        // int maxright = 0;
        // int volume = 0;
        // while(left<=right){
        //     if(height[left]<=height[right]){
        //         if(height[left]>=maxleft){
        //             maxleft = height[left];
        //         }
        //         else{
        //             volume = volume + maxleft - height[left];
        //         }
        //         left++;
        //     }
        //     else{
        //         if(height[right]>=maxright){
        //             maxright = height[right];
        //         }
        //         else{
        //             volume = volume + maxright - height[right];
        //         }
        //         right--;
        //     }
        // }
        // return volume;

        int n = height.length;
        int maxright = 0;
        int maxleft = 0;
        int volume = 0;

        int left = 0;
        int right = n-1;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= maxleft){
                    maxleft = height[left];
                }
                else{
                    volume = volume + maxleft - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= maxright){
                    maxright = height[right];
                }
                else{
                    volume = volume + maxright - height[right];
                }
                right--;
            }
        }
        return volume;
    }
}
