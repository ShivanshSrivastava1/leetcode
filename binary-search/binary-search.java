class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int med = (high + low)/2;
            if (nums[med] > target) {
                high = med-1;
            } else if (nums[med] < target) {
                low = med+1;
            } else {
                return med;
            }
        }
        return -1;
    }
}