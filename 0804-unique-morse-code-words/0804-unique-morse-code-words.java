class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> str = new HashSet<>();

        for(int i=0; i<words.length; i++) {
            StringBuilder temp = new StringBuilder();

            for(int j=0; j<words[i].length(); j++) {
                int index = words[i].charAt(j) - 'a';
                temp.append(morse[index]);
            }
            str.add(temp.toString());
        }
        return str.size();
    }
}