class Solution {
    public int lengthOfLastWord(String s) {
      String st[] = s.trim().split("\\s+");
      return st[st.length-1].length();
    }
}