class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int len = columnTitle.length();
        for(int i=0; i<len; i++) {
            int value = columnTitle.charAt(i)-64;
            ans = ans * 26 + value;
        }
        return ans;
    }
}