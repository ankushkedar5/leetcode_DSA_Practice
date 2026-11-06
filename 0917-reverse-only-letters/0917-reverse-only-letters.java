class Solution {
    public static boolean isEnglishChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            while(start < end && !isEnglishChar(arr[start])) start++;
            while(start < end && !isEnglishChar(arr[end])) end--;

            if(isEnglishChar(arr[start]) && isEnglishChar(arr[end])) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        return new String(arr);
    }
}