class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int stone : stones) list.add(stone);

        while(list.size() > 1) {
            int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;

            for(int i=0; i<list.size(); i++) {
                if(list.get(i) > max) {secMax = max; max = list.get(i);}
                else if(list.get(i) > secMax) secMax = list.get(i);
            }

            if(max == secMax) {
                list.remove(Integer.valueOf(max));
                list.remove(Integer.valueOf(secMax));
            }
            else {
                list.remove(Integer.valueOf(max));
                list.remove(Integer.valueOf(secMax));
                list.add(max - secMax);
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}