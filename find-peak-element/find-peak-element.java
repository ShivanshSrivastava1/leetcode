class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while (low < high) {
            int med = low + (high - low) / 2;
            if (nums[med] > nums[med+1]) {
                high = med;
            } else {
                low = med+1;
            }
        }
        return low;
    }
}