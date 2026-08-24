class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int lastWordIdx = words.length-1;
        return words[lastWordIdx].length();
    }
}