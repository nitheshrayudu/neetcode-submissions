class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int water =0;
        int maxLeftHeight =0;
        int maxRightHeight =0;

        while(left< right){
            if(height[left] <= height[right]){
                if(height[left] >= maxLeftHeight ){
                    maxLeftHeight = height[left];
                } else {
                    water += maxLeftHeight - height[left];
                }
                left++;
            } else {
                if(height[right] >= maxRightHeight){
                    maxRightHeight = height[right];
                } else {
                    water += maxRightHeight - height[right];
                }
                right--;
            }
        }

        return water;

    }
}
