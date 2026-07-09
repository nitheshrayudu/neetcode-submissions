class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        // send the result, the empty arraylist, nums, and starting position
        backtracking(resultList, new ArrayList<>(), nums, 0);

        return resultList;
        
    }

    public void backtracking(List<List<Integer>> resultSet, 
        List<Integer> tempSet, int[] nums, int start){
        // Add set to result
        resultSet.add(new ArrayList<>(tempSet));
        for(int i=start;i< nums.length; i++){
            // Add the number itself to the tempSet
            tempSet.add(nums[i]);

            // again go inside the loop for backtracking.
            // recursively starting with next one.

            backtracking(resultSet, tempSet, nums, i+1);

            // remove the added one.
            tempSet.remove(tempSet.size()-1);
        }

    }
    
}
