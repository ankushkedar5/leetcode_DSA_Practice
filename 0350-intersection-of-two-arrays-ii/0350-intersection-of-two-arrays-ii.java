import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int num : nums1) {
            list.add(num);
        }

        for(int num : nums2) {
            if(list.contains(num)) {
                resultList.add(num);
                list.remove((Integer) num);
            }
        }

        int[] ans = new int[resultList.size()];
        int i = 0;
        for(int num : resultList) {
            ans[i++] = num;
        }
        return ans;
    }
}