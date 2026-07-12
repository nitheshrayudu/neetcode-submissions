class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int maxCount = 0;
        if(nums.length ==0){
            return 0;
        }

        for(int i=1;i< nums.length;i++){
            int diff = nums[i]-nums[i-1];
            if(diff == 0){
                continue;
            }
            if(diff == 1){
                count++;
                maxCount = Integer.max(count, maxCount);
            } else {
                maxCount = Integer.max(count, maxCount);
                count =0;
            }
        }
        return maxCount+1;
    }
}
