class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int longest = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) { 
            char ch = s.charAt(right); // right expands
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;                       // left shrinks
            }
            map.put(ch, right);                               // store where c actually is
            longest = Math.max(longest, right - left + 1);
        }       
        return longest;
    }
}
