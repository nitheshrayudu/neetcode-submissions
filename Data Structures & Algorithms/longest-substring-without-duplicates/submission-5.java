class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        int longest =0;
        int left=0;
        for(int right=0;right< s.length(); right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch)+1;
            }

            map.put(ch,right);
            longest= Math.max(longest, right-left+1);
        }
        return longest;
    }
}
