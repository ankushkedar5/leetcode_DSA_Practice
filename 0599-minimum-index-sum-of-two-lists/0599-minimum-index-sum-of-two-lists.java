class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();
        for(int i=0; i<list1.length; i++) {
            indexMap.put(list1[i], i);
        }

        List<String> ans = new ArrayList<>();
        int minIndex = Integer.MAX_VALUE;

        for(int j=0; j<list2.length; j++) {
            if(indexMap.containsKey(list2[j])) {
                int sum = indexMap.get(list2[j]) + j;
                if(sum < minIndex) {
                    minIndex = sum;
                    ans.clear();
                    ans.add(list2[j]);
                }
                else if(sum == minIndex) {
                    ans.add(list2[j]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}