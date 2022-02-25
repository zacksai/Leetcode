import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class to test LeetCode 9: Palindrome Number Test
 */
public class Z9PalindromeNumberTest{


    /**
     * test zero
     */
    @Test
    public void testZero(){
        Z9PalindromeNumber test = new Z9PalindromeNumber();
        assertTrue("Zero is a palindrome", test.isPalindrome(0));

    }

    /**
     * tests negative values
     */
    @Test
    public void testNegatives(){
        Z9PalindromeNumber test = new Z9PalindromeNumber();

        // Check all negative ints (increment by 1111)
        for (int i = -1; i > -2147482537 ; i= i + (-1111)) {
            assertFalse("Negative number " + i + " fails.", test.isPalindrome(i));
        }
    }


    /**
     * tests positive palindrome values
     *
     * need to find a way to add all the palindromes in acceptable int range
     */
    @Test
    public void testPositives(){
        Z9PalindromeNumber test = new Z9PalindromeNumber();

        // Check all negative ints (increment by 1111)
        for (int i = 1111; i < 1000 ; i= i + (111)) {
            assertTrue("Palindrome " + i + " fails.", test.isPalindrome(i));
        }
        for (int i = 11111; i < 10000 ; i= i + (1210)) {
            assertTrue("Palindrome " + i + " fails.", test.isPalindrome(i));
        }
        for (int i = 111111; i < 10000 ; i= i + (11110)) {
            assertTrue("Palindrome " + i + " fails.", test.isPalindrome(i));
        }


    }

}