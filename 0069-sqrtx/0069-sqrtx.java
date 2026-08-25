class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int st = 1;
        int ls = x;
        int ans = 0;
        while(st <= ls) {
            int md = st + (ls - st) / 2;
            long sq = (long) md * md;
            if(sq == x) {
                return md;
            }
            else if(sq < x) {
                ans = md;
                st = md+1;
            }
            else {
                ls = md-1;
            }
        }
        return ans;
    }
}