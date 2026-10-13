class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int dublicate = -1;
        for(int num : nums) {
            if(!set.add(num)) {
                dublicate = num;
            }
        }

        int missing = -1;
        for(int i=1; i<=nums.length; i++) {
            if(!set.contains(i)) {
                missing = i;
            }
        }

        return new int[] {dublicate, missing};
    }
}