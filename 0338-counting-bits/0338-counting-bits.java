class Solution {
    public int[] countBits(int n) {
      if (n < 0) {
            return null;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int prevNum = i >> 1;
            dp[i] = dp[prevNum] + (i % 2);
        }
        return dp;
      
    }
}