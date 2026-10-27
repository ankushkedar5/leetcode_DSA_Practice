class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();

        int first = 0; 
        int second = 0;

        int count = 0;
        while(second <= s.length() - 1) {
            if(s.charAt(first) == s.charAt(second)) {
                count++;
                second++;
            }
            else {
                if(count >= 3) {
                    ans.add(List.of(first, second-1));
                }
                first = second;
                count = 0;
            }
        }
        if(count >=3) ans.add(List.of(first, second-1));
        return ans;
    }
}