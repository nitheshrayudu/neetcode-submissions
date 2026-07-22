class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<Integer>();
        int[] result = new int[temperatures.length];

        for(int i=0;i< temperatures.length;i++){

            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev = st.pop();
                result[prev] = i - prev;
            }

            st.push(i);
        }
        return result;
    }
}
