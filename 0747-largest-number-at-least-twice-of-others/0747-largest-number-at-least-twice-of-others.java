class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0];
        int secondLargest = -1;
        int index = 0;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                index = i;

            }
            else if(nums[i] > secondLargest) secondLargest = nums[i];
        }
        return largest >= 2*secondLargest ? index : -1;
    }
}