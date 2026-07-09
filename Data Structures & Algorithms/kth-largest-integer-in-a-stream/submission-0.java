class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> a-b);
    int kth = 0;
    public KthLargest(int k, int[] nums) {
        this.kth = k;
        for(int i=0; i< nums.length; i++){
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        
        if(pq.size() > kth){
            pq.poll();
        }

        return pq.peek();
    }
}
