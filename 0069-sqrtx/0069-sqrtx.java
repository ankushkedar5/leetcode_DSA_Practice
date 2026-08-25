class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int st = 1;
        int ls = x;
        int ans = 0;
        while(st <= ls) {
            int md = st + (ls - st) / 2;
            if((long) md*md == x) {
                return md;
            }
            else if((long) md*md < x) {
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