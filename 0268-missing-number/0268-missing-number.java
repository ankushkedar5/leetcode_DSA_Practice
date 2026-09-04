class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual = n*(n+1) / 2;

        return actual - Arrays.stream(nums).sum();
    }
}