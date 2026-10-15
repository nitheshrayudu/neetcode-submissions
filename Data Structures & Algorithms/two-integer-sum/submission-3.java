class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[2];

        // 3,4 0,1
        // 4,3 
        // 5,2
        // 6,1


        for(int i=0; i< nums.length; i++){
            int compliement = target - nums[i];
            // 7-3 = 4
            if(hm.containsKey(compliement)){
                result[0] = hm.get(compliement);
                result[1] = i;
                return result;
            } else {
                hm.put(nums[i], i); //(0,1)
            }
        }
        return result;
    }
}
