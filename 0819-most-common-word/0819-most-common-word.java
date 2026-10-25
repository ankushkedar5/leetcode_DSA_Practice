class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String cleaned = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", " ");
        String[] words = cleaned.split("\\s+");

        String ans = words[0];
        int maxFreq = 0;
        for(int i=0; i<words.length; i++) {

            boolean isBanned = false;
            for(int j=0; j<banned.length; j++) {
                if(words[i].equals(banned[j])) {
                    isBanned = true; 
                    break;
                }
            }
            if(isBanned) continue;

            int freq = 0;
            for(int k=0; k<words.length; k++) {
                if(words[i].equals(words[k])) freq++;
            }

            if(freq > maxFreq) {
                maxFreq = freq;
                ans = words[i];
            }
        }
        return ans.toLowerCase();
    }
} 