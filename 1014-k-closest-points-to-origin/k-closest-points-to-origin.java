class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq =  new PriorityQueue<>((a,b)->Double.compare
        (Math.sqrt(b[0]*b[0]+b[1]*b[1]),Math.sqrt(a[0]*a[0]+a[1]*a[1])));
        for(int p[]:points){
            pq.offer(p);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] res = new int[k][2];
        int i = 0;
        while(!pq.isEmpty()){
            res[i]=pq.poll();
            i++;
        }
        return res;

        
    }
}