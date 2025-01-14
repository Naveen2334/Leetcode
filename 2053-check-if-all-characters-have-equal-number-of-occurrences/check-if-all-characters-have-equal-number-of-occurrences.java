class Solution {
    public boolean areOccurrencesEqual(String s) {
         HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
       // Char arr[] =  s.toCharArray();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            //s = "aaabb" 
            //a|a|a|b|b

           

        }

        // Check if all frequencies are the same
        int frequency = -1;
        for (int value : frequencyMap.values()) {
            if (frequency == -1) {
                frequency = value; // Set the frequency on the first iteration
            } else if (frequency != value) {
                return false; // Return false if frequencies differ
            }
        }

        return true;
        
    }
}