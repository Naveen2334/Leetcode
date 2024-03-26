class Solution {
    public int[] sortedSquares(int[] nums) {
      
     // int arr[] =  new int[nums.length-1];
     for(int i = 0;i<nums.length;i++){
      
        nums[i]=nums[i]*nums[i];
      
    }
      Arrays.sort(nums);
      return nums;
        
    }
}