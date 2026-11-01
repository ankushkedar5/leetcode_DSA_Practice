class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> freq = new HashMap<>();

        for(String word : s1.split(" ")) {
            if(freq.containsKey(word)) {
                int oldCount = freq.get(word);
                freq.put(word, oldCount+1);
            }
            else {
                freq.put(word, 1);
            }
        }

        for(String word : s2.split(" ")) {
            if(freq.containsKey(word)) {
                int oldCount = freq.get(word);
                freq.put(word, oldCount+1);
            }
            else {
                freq.put(word, 1);
            }
        }

        List<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> pair : freq.entrySet()) {
            if(pair.getValue() == 1) ans.add(pair.getKey());
        }

        return ans.toArray(new String[0]);
    }
}