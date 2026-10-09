
import java.util.HashMap;
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int freqCount = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] == nums[i]) freqCount++;
            }
            freq.put(nums[i],freqCount);
        }

        int best = 0;
        for(int key : freq.keySet()) {
            if(freq.containsKey(key+1)) {
                best = Math.max(best, freq.get(key) + freq.get(key+1));
            }
        }
        return best;
    }
}