class Solution {
    public int maxArea(int[] heights) {
        int maxWater =0;

        int left = 0;
        int right =heights.length-1;
        while(left< right){
            // Chec which is the highest height between left and right indices
            int h = Math.min(heights[left], heights[right]);
            int maxWidth = right-left;
            //Calculate area = h* width
            int water = h * maxWidth;
            maxWater = Math.max(water,maxWater);

            if(heights[left] <= heights[right]){
                left++;
            } else {
                right--;
            }

        }
        return maxWater;
    }
}
