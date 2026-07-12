class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase().replaceAll("[^a-z0-9]","");
        //StringBuilder sb = new StringBuilder();
        //String result = "";

        if(lower.length() == 0 || lower.length() == 1){
            return true;
        }
        int left =0;
        int right = lower.length()-1;
        boolean result = false;

        while(left < right){
            if(lower.charAt(left) == lower.charAt(right)){
                left++;
                right--;
                result = true;
            } else{
                left++;
                right--;
                result = false;
            }
        }
        return result;
    }
}
