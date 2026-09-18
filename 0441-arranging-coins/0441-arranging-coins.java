class Solution {
    public int arrangeCoins(int n) {
        if(n < 1) {
            return 0;
        }
        int count = 0;
        for(int i=1; i<=n; i++) {
            n -= i;
            count++;
            if(n < 1) return count;
            
        }
        return count;
    }
}