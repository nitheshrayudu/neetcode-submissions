class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        LinkedList<Integer> list = new LinkedList<>(map.keySet());
        list.sort((a,b)-> Integer.compare(map.get(b),map.get(a)));
        for (int j = 0; j < k; j++) {
            result[j] = list.get(j);
        }
        return result;
    }
}
