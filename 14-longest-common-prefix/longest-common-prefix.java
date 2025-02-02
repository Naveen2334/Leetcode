class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Base case
       if (strs == null || strs.length == 0) {
            return "";
        }
       // strs = ["flower","flow","flight"];
        
        String prefix = strs[0]; 
      

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; 
                }
            }
        }

        return prefix; 
    }
}