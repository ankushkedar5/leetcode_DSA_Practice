class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();

        int uCount = 0;
        for(int i=0; i<len; i++) {
            if(Character.isUpperCase(word.charAt(i))) uCount++;
        }

        return uCount == len || uCount == 0 || (uCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}