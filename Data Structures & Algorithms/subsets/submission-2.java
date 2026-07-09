class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // result, new arraylist for each iteration, the array, the start point
        backtracking(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void backtracking(List<List<Integer>> result, List<Integer> current, int[] nums, int start){
        System.out.println(current);
        result.add(new ArrayList<>(current));

        for(int i=start; i< nums.length; i++){
            System.out.println(nums[i]);
            current.add(nums[i]);

            backtracking(result, current, nums, i+1);

            current.remove(current.size()-1);
        }


    }
}
