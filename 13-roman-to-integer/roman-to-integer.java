class Solution {
    public int romanToInt(String s) {
        // Map to store Roman numeral values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        //C

        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentValue = romanValues.get(c);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
           //     1000-100=900
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }

            // Update previous value
            prevValue = currentValue;
        }

        return total;
        
    }
}