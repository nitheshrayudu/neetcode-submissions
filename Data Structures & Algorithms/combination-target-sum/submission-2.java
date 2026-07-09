class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<>(), target, nums, 0);
        return result;
    }

    public void backtracking(List<List<Integer>> result, List<Integer> current, int target, int[] nums,int start){            
        if(target < 0){
            return;
        }

        if(target == 0){
            result.add(new ArrayList<>(current));
        }
        for(int i=start;i<nums.length; i++){
            current.add(nums[i]);

            backtracking(result, current, target-nums[i], nums, i);

            current.remove(current.size()-1);
        
        
        }


    }
}
