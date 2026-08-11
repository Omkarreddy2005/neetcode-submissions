class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>1){
            int temp=pq.poll()-pq.poll();
            pq.offer(temp);
        }
        return pq.peek();
    }
}
