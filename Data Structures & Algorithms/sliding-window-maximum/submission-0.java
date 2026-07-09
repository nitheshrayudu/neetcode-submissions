class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //int right = k-1;
        int[] result = new int[nums.length - k + 1];
        int answercount = 0;
        for(int left=0; left<= nums.length-k;left++){
            int right = left + k -1;
            int count = left;
            
            // count0 --- 0,1,2
            // count1 --- 1,2,3
             PriorityQueue<Integer> max = new PriorityQueue<Integer>((a,b)->Integer.compare(b,a));
            while(count<= right){            
                max.offer(nums[count]);
                count++;     
            }
            
            result[answercount] = max.poll();
            answercount++;
        }
        return result;
    }
}
