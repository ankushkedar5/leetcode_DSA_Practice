class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int[] im : image) {
            int start = 0; 
            int end = n - 1;

            while(start < end) {
                int temp = im[start] == 1 ? 0 : 1;
                im[start] = im[end] == 1 ? 0 : 1;
                im[end] = temp;

                start++;
                end--;
            }
            if(n%2 != 0) im[n/2] = im[n/2] == 1 ? 0 : 1;
        }
        return image;
    }
}