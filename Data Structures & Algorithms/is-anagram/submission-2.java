class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for(int i=0;i<s.length();i++){
            sArray[s.charAt(i)-'a']++;
            tArray[t.charAt(i)-'a']++; 
        }

        if(Arrays.equals(sArray,tArray)){
            return true;
        }else{
            return false;
        }
    }
}
