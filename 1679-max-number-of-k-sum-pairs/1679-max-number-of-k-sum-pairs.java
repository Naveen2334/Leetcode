class Solution {
    public int maxOperations(int[] nums, int k) {
      
      int count  = 0 ;
      Map<Integer,Integer> map = new HashMap<>();
      for(int num:nums){
        if(map.containsKey(k-num)&&map.get(k-num)>0){
          map.put(k-num,map.get(k-num)-1);
          count++;
        }
        else{
          map.put(num,map.getOrDefault(num,0)+1);
        }
      }
      return count;
    }
}