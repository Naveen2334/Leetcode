class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        for (int i = 0; i<n; i++) {
            sum+=nums[i];
        }
        if (sum%2!=0) return false;
        boolean [] dp = new boolean[sum+1];
        dp[0] = true;
        for (int i = 0; i<n; i++) {
            for (int j = sum; j>=nums[i]; j--) {
                if (dp[j-nums[i]]) {
                    dp[j] = true;
                }
            }
        }
        return dp[sum/2];
    
    }
}