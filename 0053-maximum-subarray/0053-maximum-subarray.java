class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++) {
            sum = sum < 0 ? nums[i] : sum + nums[i];
            maxSum = sum > maxSum ? sum : maxSum;
        }
        return maxSum;
    }
}