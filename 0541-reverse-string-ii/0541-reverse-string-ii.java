class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k, n);      // exclusive end
            reverse(arr, i, end - 1);
        }
        return new String(arr);
    }
    
    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char t = arr[l];
            arr[l++] = arr[r];
            arr[r--] = t;
        }
    }
}