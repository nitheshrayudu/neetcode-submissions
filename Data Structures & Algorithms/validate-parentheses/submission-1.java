class Solution {
    public boolean isValid(String s) {
        //String neews = s.replaceAll("[a-zA-Z]","")
        Stack<Character> newStack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                newStack.push(ch);
            } else {
                if(newStack.isEmpty() || !isMatchingPair( newStack.pop(), ch)){
                    return false;
                }
            }
        }
        return newStack.isEmpty();
    }
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
