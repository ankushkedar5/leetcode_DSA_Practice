class Solution {
    public int majorityElement(int[] nums) {
        int mejElement = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                mejElement = nums[i];
            }
            count += (nums[i] == mejElement) ? 1 : -1;
        }
        return mejElement;
    }
}