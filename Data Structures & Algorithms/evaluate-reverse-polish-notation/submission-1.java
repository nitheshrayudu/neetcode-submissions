class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(String token: tokens){
                switch (token) {
                    case "+":
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a + b);
                        break;

                    case "-":
                        int b1 = stack.pop();
                        int a1 = stack.pop();
                        stack.push(a1 - b1);
                        break;

                    case "*":
                        int b2 = stack.pop();
                        int a2 = stack.pop();
                        stack.push(a2 * b2);
                        break;

                    case "/":
                        int b3 = stack.pop();
                        int a3 = stack.pop();
                        stack.push(a3 / b3);
                        break;

                    default:
                        stack.push(Integer.parseInt(token));
                }
            
        }
        return stack.pop();
    }
}
