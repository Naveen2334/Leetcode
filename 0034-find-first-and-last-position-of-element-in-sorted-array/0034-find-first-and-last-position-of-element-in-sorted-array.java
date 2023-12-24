class Solution {
    public int[] searchRange(int[] nums, int target) {
       int n = nums.length;
        int l = 0;
        int r = n - 1;
        
        while(l <= r) {
            int p = l + (r - l) / 2;
            
            if(nums[p] == target) {
                int l0 = p;
                int r0 = p;
                
                while(l0 >= 0 && nums[l0] == target) 
                    l0--;
                while(r0 < n && nums[r0] == target) 
                    r0++;
                
                return new int[] {l0 + 1, r0 - 1};
                
            } else if (nums[p] < target) 
                l = p + 1;
            else 
                r = p - 1;
        }
        
        return new int[] {-1, -1};
  
}
}