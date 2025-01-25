class Solution {
    public int minTimeToType(String word) {
         int totalSeconds = 0;
        char currentPointer = 'a'; // Pointer starts at 'a'

        for (char target : word.toCharArray()) {
            // Calculate the distance clockwise and counterclockwise
            int clockwiseDistance = Math.abs(target - currentPointer);
            int counterclockwiseDistance = 26 - clockwiseDistance;

            // Add the minimum distance to the total seconds
            totalSeconds += Math.min(clockwiseDistance, counterclockwiseDistance);

            // Add 1 second for typing the character
            totalSeconds++;

            // Move the pointer to the current target character
            currentPointer = target;
        }

        return totalSeconds;
    }
}