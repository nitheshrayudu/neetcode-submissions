class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        //Arrays.sort(nums);
        backtracking(resultList, new ArrayList<>(), 0, target, nums);
        return resultList;

    }
    public void backtracking(List<List<Integer>> resultSet, List<Integer> current,
        int start, int target,int[] nums){
        if(target < 0){
            return;
        }
        if(target ==0){
            resultSet.add(new ArrayList<>(current));
        }
        for(int i=start;i< nums.length; i++){
            current.add(nums[i]);
            backtracking( resultSet, current,i,target-nums[i],nums);
            current.remove(current.size()-1);
        }

    }
}
