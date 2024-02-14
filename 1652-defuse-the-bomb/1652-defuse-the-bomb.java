class Solution {
   public int[] decrypt(int[] code, int k) {
        int result[] = new int[code.length];
        // If the K is zero just return the array
        if (k == 0) {
            return result;
        } else if (k > 0) {
            int sum = 0;
            // Window sum for the K elements
            for (int i = 1; i <= k; i++) {
                sum += code[i];
            }
            result[0] = sum;
            // Decrease the current element and add one element to the sum
            for (int i = 1; i < code.length; i++) {
                result[i] = sum - code[i] + code[(i + k) % code.length];
                sum = result[i];
            }
        } else {
            int sum = 0;
            for (int i = code.length - 2; i > code.length - 2 + k; i--) {
                sum += code[i];
            }
            result[code.length - 1] = sum;
            for (int i = code.length - 2; i >= 0; i--) {
                int pos = i + k;
                if (pos < 0) {
                    pos = code.length + pos;
                }
                result[i] = sum - code[i] + code[pos];
                sum = result[i];
            }
        }
        return result;
    }
}