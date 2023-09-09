class Solution {
    public boolean backspaceCompare(String s, String t) {
        if (s == null || t == null) return false;
        
        return type(s).equals(type(t));
    }
    
    private String type(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}