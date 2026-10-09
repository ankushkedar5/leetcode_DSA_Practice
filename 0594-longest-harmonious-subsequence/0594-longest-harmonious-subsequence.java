class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int num : nums) {
            freq.put(num,freq.getOrDefault(num, 0) + 1);
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