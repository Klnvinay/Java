import java.util.*;
public class PangramChecker {
    public static boolean isPangram(String str) {
        // Convert the input string to lowercase for case-insensitivity
        str = str.toLowerCase();

        // Iterate through the alphabet from 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}