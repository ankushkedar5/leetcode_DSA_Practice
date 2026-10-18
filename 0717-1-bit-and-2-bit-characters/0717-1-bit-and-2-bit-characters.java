class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length-1] == 1) return false;

        int one = 0;
        for(int i=bits.length - 2; i>=0 && bits[i] == 1; i--) {
            one++;
        }
        return one % 2 == 0;
    }
}