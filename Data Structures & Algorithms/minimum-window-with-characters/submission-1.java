class Solution {
    public String minWindow(String s, String t) {
        int[] sWindow = new int[128];
        int[] tWindow = new int[128];
        //HashMap<Character, Integer> tmap = new HashMap<Character, Integer>();
        
        if(t.length()> s.length()){
            return "";
        }
        String response = "";

        // get the count of the t characters.
        for(int i=0;i< t.length(); i++){
          tWindow[t.charAt(i)]++;  
        }

        int left =0;
        int have =0;
        int leastLen = 1000000;
        int need = t.length();

        for(int right=0; right< s.length(); right++){
            char c = s.charAt(right);
            sWindow[s.charAt(right)]++;

            // start increasing the 
            if(tWindow[c] > 0 && sWindow[c] <= tWindow[c]){
                have++;
            }
            while(have==need){
                //current window
                if(right-left+1 < leastLen){
                    leastLen = right-left+1;
                    response = s.substring(left, right+1);
                }
                // check if the left haracter is required 
                char leftChar = s.charAt(left);
                sWindow[leftChar]--;
                if(tWindow[leftChar] > 0 && sWindow[leftChar] < tWindow[leftChar] ){
                    have--;
                }
                left++;
            }

        }
        return response;


    }
}
