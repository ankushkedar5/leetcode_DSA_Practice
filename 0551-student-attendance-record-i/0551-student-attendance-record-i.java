class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int strikeL = 0;
        for(char ch : s.toCharArray()) {
            if(ch == 'A') {
                if(++countA >= 2) return false;
                strikeL = 0;
            }
            else if(ch == 'L') {
                if(++strikeL >= 3) return false;
            }
            else strikeL = 0;
        }
        return true;
    }
}