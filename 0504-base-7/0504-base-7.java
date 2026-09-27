class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        
        boolean isNegative = num < 0;
        num = Math.abs(num);
        
        int ans = 0;
        int up = 1;
        
        while (num > 0) {
            int remainder = num % 7;
            num = num / 7;
            ans = ans + (up * remainder);
            up = up * 10;
        }
        
        return isNegative ? "-" + ans : "" + ans;
    }
}