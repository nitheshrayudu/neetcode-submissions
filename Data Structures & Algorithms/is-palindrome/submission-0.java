class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int right =s.length()-1;
        for(int left=0; left<s.length(); left++){
            if(right != left){
                //System.out.println(s.charAt(left) + "  "+ s.charAt(right));
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
            }
            right--;
        }
        return true;
    }
}
