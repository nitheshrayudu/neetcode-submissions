class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] sum = new int[2];
        for(int i=0; i< nums.length; i++){
            int diff = target - nums[i] ;
            //System.out.println(diff);
            if(map.containsKey(nums[i])){
                sum[0] = map.get(nums[i]);
                sum[1] = i;
                return sum;
            } else{
                map.put(diff, i);
            }
             System.out.println(map);
        }
        return sum;
    }
}
