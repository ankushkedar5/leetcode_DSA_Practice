class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder ans = new StringBuilder();
        for(char ch : binary.toCharArray()) {
            ans.append(ch == '1' ? "0" : "1");
        }
        return Integer.parseInt(ans.toString(), 2);
    }
}