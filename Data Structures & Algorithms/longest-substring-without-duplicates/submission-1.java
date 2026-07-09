class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int left =0;
        int maxLength =0;
        for(int right=0; right< s.length(); right++){
            // get char
            char c = s.charAt(right);
            // Check if the char exists in hashmap also check if get is right of left
            // swap it
            if(hm.containsKey(c) && hm.get(c) >= left){
                left = hm.get(c)+1;
            }

            hm.put(c, right);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
