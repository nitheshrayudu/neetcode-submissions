class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        // try iterating the get the string.
        for(int i=0;i< strs.length; i++){
            int[] count = getCharArray(strs[i]);
            String key = Arrays.toString(count);
            //System.out.println(key);
            List<String> rrr = new ArrayList<>();
            if(map.containsKey(key)){
                //System.out.println(map);
                map.get(key).add(strs[i]);
            } else{
                rrr.add(strs[i]);
                map.put(key, rrr);
            }
        }
        
        for(String sslist: map.keySet()){
            result.add(map.get(sslist));
        }
        
        return result;
    }

    public int[] getCharArray(String str){
        int[] rrr = new int[26];
        for(char ch: str.toCharArray()){
            rrr[ch-'a']++;
        }
        return rrr;
    }
}
