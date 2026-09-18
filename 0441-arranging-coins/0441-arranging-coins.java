class Solution {
    public int arrangeCoins(int n) {
        long low = 0;
        long high = n;

        
        while(low <= high) {
            long mid = low + (high - low) / 2;
            long coinNeeded = mid * (mid + 1) / 2;
            if(coinNeeded == n) {
                return (int) mid; 
            }
            else if(coinNeeded < n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }  
        }
        return (int) high;
    }
}