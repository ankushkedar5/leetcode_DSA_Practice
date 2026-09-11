class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> available = new ArrayList<>();
        for(char ch : magazine.toCharArray()) {
            available.add(ch);
        }

        for(char ch : ransomNote.toCharArray()) {
            if(!available.contains(ch)) {
                return false;
            }
            available.remove((Character) ch);
        }
        return true;
    }
}