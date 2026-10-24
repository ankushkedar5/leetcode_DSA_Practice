class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;

        int size = 0;
        int index;
        for(int i=0; i<s.length(); i++) {
            index = s.charAt(i) - 'a';

            size += widths[index];
            if(size == 100) {
                
            }
            else if(size > 100) {
                lines++;
                size = widths[index];
            }
        }
        return new int[] {lines, size};

    }
}