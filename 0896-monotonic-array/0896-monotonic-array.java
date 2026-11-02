class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incr = nums[0] <= nums[nums.length-1];

        for(int i=1; i<nums.length; i++) {
            if(incr) {
                if(nums[i-1] > nums[i]) return false;
            }
            else {
                if(nums[i-1] < nums[i]) return false;
            }
        }
        return true;
    }
}