class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num:nums){
            map.put(num,1);
        }
        if( nums.length > map.size() ){
            return true;
        } else {
            return false;
        }

    }
}