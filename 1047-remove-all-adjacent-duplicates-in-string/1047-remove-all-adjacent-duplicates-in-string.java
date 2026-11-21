class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()) {
            int len = str.length();
            if(len > 0 && str.charAt(len - 1) == ch) {
                str.deleteCharAt(len - 1);
            }
            else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}