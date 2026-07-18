class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        //Stack<Character> sttt = new Stack<Character>();
        //boolean result = false;
        
        for(int i=0;i< s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            } else{
                if(st.isEmpty() || !isValid(st.pop(), ch)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public boolean isValid(char a, char b){
        if(
            (a == '(' && b == ')') ||
            (a == '[' && b == ']') ||
            (a == '{' && b == '}'))
            return true;
        else
            return false;
    }
}
