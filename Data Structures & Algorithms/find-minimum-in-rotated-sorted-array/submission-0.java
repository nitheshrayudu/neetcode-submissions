class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = left + (right-left)/2;
            System.out.println("Mid: "+ mid);
            if(nums[mid] > nums[right]){
                left = mid+1;
                System.out.println("left: "+ mid);
            } else {
                right = mid;
                System.out.println("right: "+ right);
            }
        }
        return nums[left];
    }
}
