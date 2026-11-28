class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];

        int pairs = 0;
        for(int[] dominoe : dominoes) {
            int a = Math.min(dominoe[0], dominoe[1]);
            int b = Math.max(dominoe[0], dominoe[1]);

            int key = a * 10 + b;
            pairs += counts[key];
            counts[key]++;
        }

        return pairs;
    }
}