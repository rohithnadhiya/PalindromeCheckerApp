import java.util.Scanner;
import java.util.Stack;

/**
 * -----------------------------------------------------
 * MAIN CLASS - PalindromeCheckerApp
 * -----------------------------------------------------
 *
 * UC12: Strategy Pattern for Palindrome Algorithms
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * Stack Strategy Implementation
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}