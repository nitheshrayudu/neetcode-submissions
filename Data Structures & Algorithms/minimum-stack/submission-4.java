class MinStack {

    Stack<Integer> sta = new Stack<Integer>();

    Stack<Integer> min = new Stack<Integer>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        sta.push(val);
        if(min.isEmpty()){
            min.push(val);
        } else{
            min.push(Math.min(val, min.peek()));
        }
    }
    
    public void pop() {
        sta.pop();
        min.pop();
    }
    
    public int top() {
        return sta.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
