class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> ans = new ArrayList<>();
        int minIndex = Integer.MAX_VALUE;

        for(int i=0; i<list1.length; i++) {
            for(int j=0; j<list2.length; j++) {

                if(list1[i].equals(list2[j])) {
                    int index = i + j;
                    if(index < minIndex) {
                        minIndex = index;
                        ans.clear();
                        ans.add(list1[i]);
                    }
                    else if(index == minIndex) {
                        ans.add(list1[i]);
                    }
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}