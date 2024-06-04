class Solution {
    public int appendCharacters(String s, String t) {
      int sl=s.length();
      int tl =  t.length();
      int si=0, ti=0;
      while(si<sl&&ti<tl){
        if(s.charAt(si)==t.charAt(ti)){
          ti++;
        }
        si++;
      }
      return tl-ti;
        
    }
}