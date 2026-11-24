/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(mountainArr.get(mid) < mountainArr.get(mid+1)) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        int peak = left;

        int lft1 = 0;
        int rgt1 = peak;
        while(lft1 <= rgt1) {
            int mid = lft1 + (rgt1 - lft1) / 2;

            int midElt = mountainArr.get(mid);
            if(midElt == target) {
                return mid;
            }
            else if(midElt < target) {
                lft1 = mid + 1;
            }
            else {
                rgt1 = mid - 1;
            }
        }

        int lft2 = peak;
        int rgt2 = mountainArr.length() - 1;
        while(lft2 <= rgt2) {
            int mid = rgt2 + (lft2 - rgt2) / 2;

            int midElt = mountainArr.get(mid);
            if(midElt == target) {
                return mid;
            }
            else if(midElt < target) {
                rgt2 = mid - 1;
            }
            else {
                lft2 = mid + 1;
            }
        }

        return -1;
    }
}