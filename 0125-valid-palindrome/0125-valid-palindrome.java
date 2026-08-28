class Solution {
    public boolean isPalindrome(String s) {
        String S = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int left = 0;
        int right = S.length()-1;
        while(left < right) {
            if(S.charAt(left) != S.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}