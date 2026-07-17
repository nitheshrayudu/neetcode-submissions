class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq = 0;
        int result = 0;
        int left =0;

        for(int right=0; right< s.length(); right++){
            // Add current count of current character.
            count[s.charAt(right)-'A']++;

            // Check if it is
            maxFreq = Math.max(maxFreq, count[s.charAt(right)-'A']);

            if((right-left+1)-maxFreq > k){
                // reduce the window
                count[s.charAt(left)-'A']--;
                left++;
            }
            result = Math.max(right-left+1,result);
        }
        return result;
    }
}
