class Solution {
    public int strStr(String haystack, String needle) {
        //base case 
         if (needle.isEmpty()) {
            return 0;
        }

        int haystackLen = haystack.length();
        int needleLen = needle.length();

       // 1000-3=
        //i=0
        //i=1
        //999-3

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}