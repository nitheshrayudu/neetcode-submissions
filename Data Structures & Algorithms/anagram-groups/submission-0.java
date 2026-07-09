class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        for(int i=0; i< strs.length;i++){
            char[] carray = strs[i].toCharArray();
            Arrays.sort(carray);
            String key = new String(carray);
            if(! hm.containsKey(key)){
                hm.put(key, new ArrayList<String>());
            }
            hm.get(key).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
