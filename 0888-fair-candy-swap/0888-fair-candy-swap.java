class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        for(int size : aliceSizes) aliceSum += size;

        int bobSum = 0;
        for(int size : bobSizes) bobSum += size;

        int diff = (aliceSum - bobSum) / 2;

        Set<Integer> bobSet = new HashSet<>();
        for(int size : bobSizes) bobSet.add(size);

        for(int a : aliceSizes) {
            int b = a - diff;
            if(bobSet.contains(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; 
    }
}