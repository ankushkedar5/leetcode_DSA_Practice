class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()) {
            str.append(ch);
        }

        int stIndex = 0;
        int depth = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                depth++;
            }
            else {
                depth--;
            }

            if(depth == 0) {
                str.setCharAt(stIndex, ' ');
                str.setCharAt(i, ' ');

                if(i+1 < s.length()) stIndex = i+1;
            }
        }
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ' ') {
                str.deleteCharAt(i);
                i--;
            }
        }
        return str.toString();
    }
}