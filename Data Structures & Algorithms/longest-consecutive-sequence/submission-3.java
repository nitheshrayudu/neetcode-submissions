class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int result =1;
        int maxResult=1;
        
        if(nums.length ==0 ){
            return 0;
        }
        // 2 20 4 10 3 4 5 = 2 3 4 4 5 10 20
        int beforeint = nums[0];
        for(int i=1;i < nums.length; i++){
           int diff = nums[i] - beforeint;
           beforeint = nums[i];
           if(diff ==0){
            continue;
           }
           if(diff == 1){
            result++;
           } 
           else {
            result = 1;
           }
           
           maxResult = Math.max(maxResult, result);
 
        }

        return maxResult;
    }
}
