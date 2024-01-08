class Solution {
    public int minTaps(int n, int[] ranges) {
        int coversEnd = 0, moves = 0;
        while (coversEnd < n) {
            int bestEnd = ranges[coversEnd] + coversEnd;
            for (int i = -100; i <= 100; i++){
                if (i + coversEnd < 0) continue;
                if (i + coversEnd > n) break;
                if ((i + coversEnd) - ranges[i + coversEnd]  <= coversEnd) bestEnd = Math.max(bestEnd, ranges[i + coversEnd] + i + coversEnd);        
            }
            moves++;
            if (coversEnd == bestEnd) return -1;
            coversEnd = bestEnd;
        }
        return moves;
    }
}