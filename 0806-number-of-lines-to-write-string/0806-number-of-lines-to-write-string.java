class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int size = 0;

        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';

            size += widths[index];
            if(size > 100) {
                lines++;
                size = widths[index];
            }
        }
        return new int[] {lines, size};
    }
}