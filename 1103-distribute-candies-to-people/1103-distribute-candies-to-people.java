class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];

        int candy = 1;
        int index = 0;
        int sum = 0;

        while(sum + candy <= candies) {
            ans[index] += candy;
            sum += candy;

            candy++;
            index++;

            if(index == num_people) {
                index = 0;
            }
        }
        
        if(sum < candies) ans[index] += candies - sum;

        return ans;
    }
}