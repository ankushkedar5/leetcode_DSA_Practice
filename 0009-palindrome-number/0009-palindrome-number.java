class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        int lastNum;

        if(x < 0) {
            return false;
        }

    while(x != 0) {
        lastNum = x % 10;
        x /= 10;
        reverse = reverse * 10 + lastNum;
    }
    return original == reverse ? true : false;
    
    }
}