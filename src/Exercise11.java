/**
 * Created by Jack on 11/11/15.
 */

// Example of testing a palindrome

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello")); // false
        System.out.println(isPalindrome("racecar")); //true
    }

    static boolean isPalindrome(String s) {
        int n = s.length();

        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
