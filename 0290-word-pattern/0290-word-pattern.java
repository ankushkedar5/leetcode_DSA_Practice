class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patternChars = pattern.toCharArray();
        String[] words = s.split(" ");
        
        if (patternChars.length != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < patternChars.length; i++) {
            char c = patternChars[i];
            String word = words[i];
            
            if(charToWord.containsKey(c)) {
                if(!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }
        return true;
    }
}