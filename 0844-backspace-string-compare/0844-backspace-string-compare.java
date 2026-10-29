class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(first.length() > 0) first.deleteCharAt(first.length()-1);
            }
            else {
                first.append(s.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(second.length() > 0) second.deleteCharAt(second.length()-1);
            }
            else {
                second.append(t.charAt(i));
            } 
        }

        return first.toString().equals(second.toString());
    }
}