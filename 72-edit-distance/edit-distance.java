class Solution {
    public int minDistance(String word1, String word2) {
     int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        // Initialize the DP table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j; // If word1 is empty, insert all characters of word2
                } else if (j == 0) {
                    dp[i][j] = i; // If word2 is empty, remove all characters of word1
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no operation needed
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],  // Delete
                                    Math.min(dp[i][j - 1],  // Insert
                                             dp[i - 1][j - 1])); // Replace
                }
            }
        }
        
        return dp[m][n];   
    }
}