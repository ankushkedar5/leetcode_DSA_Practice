class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");

        List <Character> vowels = List.of('a','e','i','o','u','A','E','I','O','U');
        for(int i=0; i<words.length; i++) {

            if(vowels.contains(words[i].charAt(0))) {
                StringBuilder wd = new StringBuilder();
                char[] chars = words[i].toCharArray();

                for(char ch : chars) {
                    wd.append(ch);
                }
                wd.append("ma");

                for(int j=0; j<i+1; j++) {
                    wd.append('a');
                }
                words[i] = wd.toString();
            }
            else {
                StringBuilder wd = new StringBuilder();
                char[] chars = words[i].toCharArray();
                char first = 0;

                for(char ch : chars) {
                    if(first == 0) {
                        first = ch;
                        continue;
                    }
                    wd.append(ch);
                }
                wd.append(first);
                wd.append("ma");

                for(int j=0; j<i+1; j++) {
                    wd.append('a');
                }
                words[i] = wd.toString();
            }
        }
        return String.join(" ", words);
    }
}