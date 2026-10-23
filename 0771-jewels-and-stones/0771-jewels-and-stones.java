class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for(int i=0; i<jewels.length(); i++) {
            int count = 0;
            for(int j=0; j<stones.length(); j++) {
                if(stones.charAt(j) == jewels.charAt(i)) count++;
            }
            ans += count;
        }
        return ans;
    }
}