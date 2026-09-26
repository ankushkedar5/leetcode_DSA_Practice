import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nge = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = nums2.length - 1; i >= 0; i--) {
            int x = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= x) {
                stack.pop();
            }
            nge.put(x, stack.isEmpty() ? -1 : stack.peek());
            stack.push(x);
        }
        
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            result[i] = nge.get(nums1[i]);
        }
        return result;
    }
}