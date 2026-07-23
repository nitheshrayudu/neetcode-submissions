class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<Integer>();

        for(int i=0; i< tokens.length; i++){
            if(tokens[i].equals("+")){
                int a = result.pop();
                int b = result.pop();
                result.push(a+b);
            }
            else if(tokens[i].equals("-")){
                int a = result.pop();
                int b = result.pop();
                result.push(b-a);
            }
            else if(tokens[i].equals("/")){
                int a = result.pop();
                int b = result.pop();
                result.push(b/a);
            }
            else if(tokens[i].equals("*")){
                int a = result.pop();
                int b = result.pop();
                result.push(a*b);
            }else{
                result.push(Integer.parseInt(tokens[i]));
            }
        }
        return result.pop();
    }
}
