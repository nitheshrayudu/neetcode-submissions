class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        int[] window = new int[26];
        boolean result = false;

        if(s1.length() > s2.length()){
            return false;
        }

        for(int i=0;i< s1.length(); i++){
            need[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        // check the first few characters if they are a match.
        if(isMatch(need, window)){
            return true;
        }

        for(int right=s1.length(); right< s2.length(); right++){
            window[s2.charAt(right)-'a']++;
            window[s2.charAt(right-s1.length())-'a']--;

            if(isMatch(need, window)){
            return true;
            }
        }

        return false;
        
    }

    public boolean isMatch(int[] a, int[] b){
        if(Arrays.equals(a,b)){
            return true;
        } else{
            return false;
        }
    }
}
