class Solution {
    public int removeDuplicates(int[] nums) {
       
        int index = 0;
      for(int i = 0;i<nums.length;i++){
        while(i<nums.length-1&&nums[i]==nums[i+1]){
     
        
        i++;
        
        }
      nums[index++]=nums[i];
        
      
    }
  return index;
    }
}