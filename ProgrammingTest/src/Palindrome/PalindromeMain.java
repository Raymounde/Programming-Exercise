package Palindrome;

/**
 * Created by Alfie on 4/10/2017.
 */
public class PalindromeMain {

    public static void main (String[] args) {
        Palindrome palindrome = new Palindrome();

        //Palindrome
        System.out.println("Palindrome Test :");
        palindrome.displayPalindrome(new Integer[] {1, 2, 3, 2, 1});
        palindrome.displayPalindrome(new Integer[] {1, 2, 3, 2, 1, 3});
        palindrome.displayPalindrome(new Integer[] {1});
        palindrome.displayPalindrome(new Integer[] {2,2});

        //Lapindrome
        System.out.println("\nLapindrome Test :");
        palindrome.displayLapindrome(new Integer[] {2, 1, 3, 2, 1});
        palindrome.displayLapindrome(new Integer[] {1, 2, 3, 4, 5, 10, 3, 2, 5, 4, 1});
    }
}
