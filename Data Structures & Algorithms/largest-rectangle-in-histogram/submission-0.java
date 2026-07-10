class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();

        int maxArea =0;
        int arraylen = heights.length;

        for(int i=0;i< arraylen;i++){
            int start =i;

            while(!stack.isEmpty() && stack.peek()[1] > heights[i] ){
                int[] top = stack.pop();
                int index = top[0];
                int height = top[1];

                int area = height * (i-index);
                maxArea = Math.max(maxArea, area);
                start = index;
            }
            stack.push(new int[]{start, heights[i]});
        }

        for(int [] pair: stack){
            int index = pair[0];
            int height = pair[1];
            int area = height * (heights.length - index);
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;

    }
}
