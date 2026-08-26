class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for(int i=0; i<accounts.length; i++) {
            int wealth = accounts[i][0];
            for(int j=1; j<accounts[0].length; j++) {
                wealth += accounts[i][j];
            }
            if(wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}