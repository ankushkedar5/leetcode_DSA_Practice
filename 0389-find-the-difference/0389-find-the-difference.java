class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }

        for(int i=0; i<t.length(); i++) {
            if(!list.contains(t.charAt(i))) {
                return t.charAt(i);
            }
            list.remove((Character) t.charAt(i));
        }
        return '\0';
    }
}