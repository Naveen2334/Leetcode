class Solution {
    public int numOfPairs(String[] nums, String target) {
      Map<String,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
         map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
      }
      int count =0;
      for(int i = 0;i<nums.length;i++){
        String word = nums[i];
      
        if(target.startsWith(word)){
          if(map.containsKey(target.substring(word.length())))
          {
            count+=map.get(target.substring(word.length()));
            if(word.equals(target.substring(word.length()))){
              count--;
            
          }        }
      }}
      
       return count;
    }
      
       
    
}