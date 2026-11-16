class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder ans = new StringBuilder();
        for(char ch : binary.toCharArray()) {
            if(ch == '1') {
                ans.append("0");
            }
            else {
                ans.append("1");
            }
        }
        return Integer.parseInt(ans.toString(), 2);
    }
}