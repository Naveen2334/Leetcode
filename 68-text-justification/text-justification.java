import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLen = words[i].length();
            int j = i + 1;

            // Greedily pack words
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length();
                j++;
            }

            int wordCount = j - i;
            StringBuilder line = new StringBuilder();

            // Case 1: Last line OR single word → left justified
            if (j == words.length || wordCount == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            }
            // Case 2: Fully justified
            else {
                int totalChars = 0;
                for (int k = i; k < j; k++) {
                    totalChars += words[k].length();
                }

                int totalSpaces = maxWidth - totalChars;
                int spacesBetween = totalSpaces / (wordCount - 1);
                int extraSpaces = totalSpaces % (wordCount - 1);

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaces = spacesBetween + (extraSpaces-- > 0 ? 1 : 0);
                        line.append(" ".repeat(spaces));
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}
