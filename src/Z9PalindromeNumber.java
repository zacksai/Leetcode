/**
 * Check if an integer is a palindrome
 * @author zacksai
 * @version 1.1
 *
 * Strategy: check half of the integer against half of its reverse
 * Edge cases: anything ending in 0 (so anything modulo 10)
 *
 * Instructions:
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
public class Z9PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || x%10 == 0 && x!=0) return false;
        int r = 0;
        while(x > r){
            r = 10 * r + (x%10);
            x /= 10;
        }
        return x == r || x == r/10;
    }

}
