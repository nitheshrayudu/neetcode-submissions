class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtracking(result, new ArrayList<>(), nums, used);
        return result;
    }

    public void backtracking(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used){
        // Base case: one complete permutation
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip if already used
            if (used[i]) {
                continue;
            }

            used[i] = true;
            current.add(nums[i]);

            backtracking(result, current, nums, used);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
