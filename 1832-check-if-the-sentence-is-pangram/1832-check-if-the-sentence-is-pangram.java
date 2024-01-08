class Solution {
public boolean checkIfPangram(String sentence) {
    int len = sentence.length();
		if (len < 26) 
			return false;
		HashSet<Character> checks = new HashSet<Character>();
		for (char c : sentence.toCharArray()) {
			checks.add(c);
		}
		return checks.size() == 26;

    }
}