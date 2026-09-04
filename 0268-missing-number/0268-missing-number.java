class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        for(int num : nums) {
            actualSum += num;
        }

        return nums.length * ( nums.length + 1 ) / 2 - actualSum;
    }
}