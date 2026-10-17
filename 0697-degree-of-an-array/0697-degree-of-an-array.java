class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int degree = 0;
        for (int freq : freqMap.values()) {
            degree = Math.max(degree, freq);
        }

        int minLength = nums.length;
        
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == degree) {
                
                int firstIndex = -1;
                int lastIndex = -1;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == num) {
                        firstIndex = i;
                        break;
                    }
                }

                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == num) {
                        lastIndex = i;
                        break;
                    }
                }
                int currentLength = lastIndex - firstIndex + 1;
                
                minLength = Math.min(minLength, currentLength);
            }
        }

        return minLength;
    }
}