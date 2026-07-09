class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(result , new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void backtracking(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start){
        if(target < 0){
            return;
        }
        if(target ==0){
            result.add(new ArrayList<>(current));
        }

        for(int i=start;i< candidates.length; i++){

            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);

            backtracking(result, current, candidates, target-candidates[i], i+1);

            current.remove(current.size()-1);
        }
    }
}
