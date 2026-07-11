class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sarray = new int[26];
        int[] tarray = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(char chs: s.toCharArray()){
            sarray[chs-'a']++;
        }

        for(char cht: t.toCharArray()){
            tarray[cht-'a']++;
        }

        if(Arrays.equals(sarray,tarray)){
            return true;
        } else {
            return false;
        }

    }
}
