/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int med = low + (high - low)/2;
            if (isBadVersion(med)) {
                high = med;
            } else {
                low = med+1;
            }
        }
        return high;
    }
}