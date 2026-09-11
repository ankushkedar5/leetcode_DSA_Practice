/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        Random rand = new Random();
        int low = 1;
        int high = n;
        
        while (low <= high) {
            int num = low + rand.nextInt(high - low + 1);
            int result = guess(num);
            
            if (result == 0) {
                return num;
            } else if (result == -1) {
                high = num - 1;       
            } else {
                low = num + 1;
            }
        }
        
        return -1; 
        
    }
}