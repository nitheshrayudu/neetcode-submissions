class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<Integer>(), 0, nums);
        return result;
    }

    public void backtracking(List<List<Integer>> result, List<Integer> current,int start, int[] nums){
        result.add(new ArrayList<>(current));
        for(int i=start;i< nums.length;i++){
            current.add(nums[i]);
            backtracking(result, current, i+1, nums);
            current.remove(current.size()-1);
        }
    }
}
