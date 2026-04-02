import java.util.*;

class Solution {
    public long maxKelements(int[] nums, int k) {

        PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            pq.offer(n);
        }
        long score =0;
        while(k>0){
            int max = pq.poll();
            score+=max;
            k--;
            int newVal = (int)Math.ceil(max/3.0);
            pq.offer(newVal);

        }
        return score;
        
    }
}