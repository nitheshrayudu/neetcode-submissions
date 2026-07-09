class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int[] nums,int target, int start, List<Integer> current,List<List<Integer>> result){
        if(target ==0){
            result.add(new ArrayList<>(current));
        }

        // Invalid path
        if (target < 0) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(
                nums,
                target - nums[i],
                i,              // reuse same number
                current,
                result
            );

            // Undo choice
            current.remove(current.size() - 1);
        }
    }

}
