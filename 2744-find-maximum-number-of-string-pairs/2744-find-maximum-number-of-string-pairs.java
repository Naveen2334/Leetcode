class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int cnt = 0;
        for (String s : words) {
            StringBuilder sb = new StringBuilder(s).reverse();
            if (set.contains(sb.toString())) {
                cnt++;
            } else {
                set.add(s);
            }
        }
        return cnt;
    }
}