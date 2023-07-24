class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long num;
        int low = 2;
        int high = x/2;
        while (low <= high) {
            int med = (low + high)/2;
            num = (long) med * med;
            if (num > x) {
                high = med-1;
            } else if (num < x) {
                low = med+1;
            } else {
                return med;
            }
        }
        return high;
    }
}