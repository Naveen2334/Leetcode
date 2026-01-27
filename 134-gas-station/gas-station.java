class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel = 0;
        int currentFuel = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalFuel += diff;
            currentFuel += diff;

            // If fuel goes negative, reset start
            if (currentFuel < 0) {
                startIndex = i + 1;
                currentFuel = 0;
            }
        }

        // Check overall feasibility
        return totalFuel >= 0 ? startIndex : -1;
    }
}
