class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = findBoundary(nums, target, true);
        if (firstPos == -1) {
            return new int[]{-1, -1};
        }
        int lastPos = findBoundary(nums, target, false);
        
        return new int[]{firstPos, lastPos};
    }
    private int findBoundary(int[] nums, int target, boolean findFirst) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1; // Stores the potential result
        
        while (low <= high) {
            // Using low + (high - low) / 2 prevents potential integer overflow
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                if (findFirst) {
                    // To find the FIRST occurrence, keep searching in the LEFT half
                    high = mid - 1;
                } else {
                    // To find the LAST occurrence, keep searching in the RIGHT half
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                // Target must be in the right half
                low = mid + 1;
            } else { // nums[mid] > target
                // Target must be in the left half
                high = mid - 1;
            }
        }
        
        return index;
    }
}
        
    
