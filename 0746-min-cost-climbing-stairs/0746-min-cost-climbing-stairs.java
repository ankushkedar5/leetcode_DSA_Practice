class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if(n == 2) return cost[0] < cost[1] ? cost[0] : cost[1];

        int prev2 = cost[0];
        int prev1 = cost[1];
        
        for(int i=2; i<n; i++) {
            int current = cost[i] + (prev1 < prev2 ? prev1 : prev2);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1 < prev2 ? prev1 : prev2;
    }
}