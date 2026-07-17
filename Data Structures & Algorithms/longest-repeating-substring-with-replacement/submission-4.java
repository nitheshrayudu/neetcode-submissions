class Solution {
    public int characterReplacement(String s, int k) {
        int[] sray = new int[26];
        int maxLength=0;
        int left=0;
        int maxFreq=0;
        for(int right=0;right< s.length(); right++){
            char current = s.charAt(right);
            sray[current-'A']++;

            maxFreq = Math.max(maxFreq, sray[current-'A']);
            int windowLength = right-left+1;
            if(windowLength-maxFreq > k){
                sray[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}
