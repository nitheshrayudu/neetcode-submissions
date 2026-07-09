class MinStack {

    private Stack<Integer> star = new Stack<Integer>();

    private Stack<Integer> minstack = new Stack<Integer>();

    private int min = Integer.MAX_VALUE;
    // private int min_previous = Integer.MAX_VALUE;

    public MinStack() {
        //minstack.push(0);
    }
    
    public void push(int val) {
        star.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        } else{
            minstack.push(Math.min(val, minstack.peek()));
        }

    }
    
    public void pop() {
        minstack.pop();
        int some = this.star.pop();
    }
    
    public int top() {
        return this.star.peek();
    }
    
    public int getMin() {
        return this.minstack.peek();
    }
}
