class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(result, new ArrayList<>(), nums, 0);
        return result;
    }
    public void backtracking(List<List<Integer>> result, List<Integer> current, int[] nums, int start){
        result.add(new ArrayList<>(current));
        //List<Integer> al = new ArrayList<>();
        for(int i=start;i< nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            
            current.add(nums[i]);
            backtracking(result, current, nums, i+1);
            current.remove(current.size()-1);
            
        }
        
    }
}
