class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        final boolean[] allowedAsciiCodes = new boolean[26];
        for (char character :
                allowed.toCharArray()) {
            allowedAsciiCodes[(int) character - 97] = true;
        }

        int consistentWordsCount = 0;

        for (String word :
                words) {
            boolean isConsistent = true;
            for (char letter :
                    word.toCharArray()) {
                if (!allowedAsciiCodes[letter - 97]) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent)
                consistentWordsCount++;
        }

        return consistentWordsCount;
    }
}