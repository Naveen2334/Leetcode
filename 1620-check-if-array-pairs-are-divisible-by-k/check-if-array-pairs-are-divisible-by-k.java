class Solution {
    public boolean canArrange(int[] arr, int k) {
    HashMap<Integer, Integer> remainderCount = new HashMap<>();

        // Count occurrences of each remainder
        for (int num : arr) {
            int remainder = ((num % k) + k) % k;  // Ensure non-negative remainder
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        // Check for pairs
        for (int r = 1; r < k; r++) {
            if (remainderCount.containsKey(r)) {
                int countR = remainderCount.get(r);
                int countK_r = remainderCount.getOrDefault(k - r, 0);
                
                if (r == k - r) {  // Special case for k/2
                    if (countR % 2 != 0) {
                        return false;
                    }
                } else {
                    if (countR != countK_r) {
                        return false;
                    }
                }
            }
        }

        // Check remainder 0
        return remainderCount.getOrDefault(0, 0) % 2 == 0;
    }
}