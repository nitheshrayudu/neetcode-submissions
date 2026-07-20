class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i< tokens.length; i++){
            if(tokens[i].equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
                //break;

            } else if(tokens[i].equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
                //break;

            } else if(tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
                //break;
            }
            else if(tokens[i].equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
                //break;
            }
            else{
                stack.push( Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
