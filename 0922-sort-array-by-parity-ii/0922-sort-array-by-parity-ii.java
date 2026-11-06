class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;

        while(even < n && odd < n) {
            while(even < nums.length && nums[even] % 2 == 0) even += 2;
            while(even < nums.length && nums[odd] % 2 != 0) odd += 2;

            if(even < n && odd < n) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
        return nums;
    }
}