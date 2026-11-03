class Solution {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            if(isEven(nums[start])) {
                start++;
            }
            else if(!isEven(nums[end])) {
                end--;
            }
            else {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }
        return nums;
    }
}