class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int result = 0;
        for(int right=0; right< s.length(); right++){
            count[s.charAt(right) - 'A']++;

            // find if the current has the max frequency
            maxFreq = Math.max(maxFreq,count[s.charAt(right) - 'A']);

            //check if the current maxFreq is ok, 
            // Validate by checking the window size and subtracting the maxFre Should be less than K
            // if so reduce the window size/
            if((right-left+1)-maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right-left+1);
        }
        return result;
    }
}
