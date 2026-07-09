class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sString = new int[26];
        int[] tString = new int[26];

        if(t.length() > s.length()){
            return false;
        }

        for(char ch: s.toCharArray()){
            sString[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            tString[ch-'a']++;
        }

        if(Arrays.equals(sString, tString)){
            return true;
        }
        else{
            return false;
        }

    }
}
