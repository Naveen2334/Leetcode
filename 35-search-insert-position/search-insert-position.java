class Solution {
    public int searchInsert(int[] nums, int target) {
     int left = 0;
        int right = nums.length - 1;
       //  nums[] = { 1,3,4,5,6,10.12,14 } target =12  mid =4  
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid to avoid overflow
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // If target is not found, `left` is the insertion position
        return left;   
    }
}