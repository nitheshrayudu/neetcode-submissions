class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            } else{
                if(st.isEmpty() || !isValid(st.pop(), c)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }


    public boolean isValid(char a, char b){
        return((a == '(' && b == ')') ||
            (a == '{' && b == '}') ||
            (a == '[' && b == ']'));
    }
}
