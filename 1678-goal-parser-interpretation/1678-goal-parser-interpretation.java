class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
       for(int i = 0;i<command.length();i++){
           char c = command.charAt(i);
           if(c=='G')
           {
               s.append(c);
           }
           else if(c =='(')
           {
            s.append(command.charAt(i + 1) == ')' ? "o" : "al");

           }
       }
        return s.toString();
        
    }
}