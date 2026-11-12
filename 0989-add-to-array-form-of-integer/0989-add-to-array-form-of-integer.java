class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int n = num.length - 1;

        int carry = 0;
        while(n >= 0 || k > 0 || carry > 0) {

            int number = carry;
            if(n >= 0) {
                number += num[n--];
            }
            if(k > 0) {
                number += k % 10;
                k /= 10;
            }
            
            list.add(number % 10);
            carry = number / 10;
        }
        Collections.reverse(list);
        return list;
    }
} 