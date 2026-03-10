import java.util.Scanner;

/**
 * -----------------------------------------------------
 * MAIN CLASS - PalindromeCheckerApp
 * -----------------------------------------------------
 *
 * UC9: Recursive Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using recursion.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Recursive method to check palindrome
     */
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}