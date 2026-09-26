class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        
        List<String> res = new ArrayList<>();
        
        for(String word : words) {
            int n1 = 0, n2 = 0, n3 = 0;
            int n = word.length();
            
            for(int i = 0; i < n; i++) {
                char c = word.charAt(i);
                if(s1.indexOf(c) != -1) n1++;
                else if(s2.indexOf(c) != -1) n2++;
                else n3++;
            }
            
            if(n1 == n || n2 == n || n3 == n) {
                res.add(word);
            }
        }
        
        return res.toArray(new String[0]);
    }
}