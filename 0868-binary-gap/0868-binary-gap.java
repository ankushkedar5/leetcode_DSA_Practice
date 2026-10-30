class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        
        int maxDist = 0;
        int dist = 0;

        int first = 0;
        int second = 0;
        while(second < binary.length()) {
            
            if(binary.charAt(second) == '1') {
                maxDist = dist > maxDist ? dist : maxDist;
                dist = 0;
                first = second;
            }
            dist++;
            second++;
        } 
        return maxDist;
    }
}