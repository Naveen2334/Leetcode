class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
      char[] arr =  s.toCharArray();
      int n = s.length();
      int max = 1;
      int countpairs = 0;
      int left = 0;
      for(int i=1;i<n;i++){
        if(arr[i]==arr[i-1]){
          countpairs++;
        }
        while(countpairs>1&&left<i){
          if(arr[left]==arr[left+1]){
            countpairs--;
          }
          left++;
        }
        max = Math.max(max,i-left+1);
      }
      return max;
        
    }
}