import java.util.HashSet;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int n = candyType.length;

        for(int i=0; i<n; i++) {
            set.add(candyType[i]);
        }

        int unique = set.size();
        return unique > n / 2 ? n / 2 : unique;
    }
}