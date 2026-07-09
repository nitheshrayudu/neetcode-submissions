class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int[] result = new int[k];

        for(int i=0;i< nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        LinkedList<Integer> list = new LinkedList<>(hm.keySet());

        list.sort((a,b)-> Integer.compare(hm.get(b),hm.get(a)));

        for (int j = 0; j < k; j++) {
            result[j] = list.get(j);
        }

        return result;
    }
}
