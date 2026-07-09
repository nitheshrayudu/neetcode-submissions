class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int count =0;
        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            if(hm.containsKey(compliment)){
                return new int[]{hm.get(compliment),i};
            }
            hm.put(nums[i],i);
        }
        return result;
    }
}
