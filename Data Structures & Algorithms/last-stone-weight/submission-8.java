class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> Integer.compare(b,a));
        
        for(int i=0; i< stones.length; i++){
            pq.offer(stones[i]);
        }

        while(!pq.isEmpty() && 
        pq.size() > 1){

            int a = pq.poll();
            int b = pq.poll();

            int diff =0;

            if(a == b){
                continue;
            } else if(a > b){
                diff = a-b;
                pq.offer(diff);
            } else {
                continue;
            }

        }

        if(pq.isEmpty()){
            return 0;
        }

        return pq.peek();

    }
}
