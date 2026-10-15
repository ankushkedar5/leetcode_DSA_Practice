class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int start = 0;
        int end = 1;
        int ans = 0;

        int count = 1;
        while(end < nums.length) {
            if(nums[start] < nums[end]) {
                count++;
                start++;
            }
            else {
                start = end;
                ans = ans < count ? count : ans;
                count = 1;
            }
            end++;
        }
        return ans < count ? count : ans;
    }
}