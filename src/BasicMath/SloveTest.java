package BasicMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countDigits() {

        assertEquals(3, new Solution().countDigits(212));
    }

    @Test
    void reverseANumber() {
        assertEquals(212, new Solution().reverseANumber(212));
    }

    @Test
    void isPalindrome() {
        assertTrue(new Solution().isPalindrome(212));
    }

    @Test
    void GCD() {
        assertEquals(2, new Solution().GCD(2,4));
    }

    @Test
    void isArmstrong() {
        assertTrue(new Solution().isArmstrong(371));
    }

    @Test
    void printPrimeNumber() {
    }

    @Test
    void printAllDivisors() {
    }

    @Test
    void isPrime() {
        assertTrue(new Solution().isPrime(13));
    }
}