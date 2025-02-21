class Solution {
    public int[][] merge(int[][] intervals) {

        //base case 
      if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Merge intervals
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {  // Overlapping case
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {  // Non-overlapping case
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current); // Add last interval

        // Convert list to array
        return merged.toArray(new int[merged.size()][]);  
    }
}