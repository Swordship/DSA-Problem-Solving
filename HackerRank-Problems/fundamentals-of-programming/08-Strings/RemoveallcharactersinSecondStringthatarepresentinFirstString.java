import java.io.*;
import java.util.*;

public class RemoveallcharactersinSecondStringthatarepresentinFirstString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(); // The string with characters to remove, e.g., "Motor"
        String str2 = sc.nextLine(); // The string to be filtered, e.g., "Motorcycle"

        // Step 1: Create a HashSet to store the "banned" characters from the first string.
        // A Set is very efficient for checking if an item exists (O(1) on average).
        Set<Character> bannedChars = new HashSet<>();

        // Step 2: Populate the set with every character from the first string.
        // The Set automatically handles duplicates (e.g., the second 'o' in "Motor" is ignored).
        for (char c : str1.toCharArray()) {
            bannedChars.add(c);
        }

        // Step 3: Create a StringBuilder to efficiently build the result string.
        StringBuilder result = new StringBuilder();

        // Step 4: Loop through the second string to decide which characters to keep.
        for (char c : str2.toCharArray()) {
            // Step 5: Check if the current character is in our banned list.
            // If the character is NOT in the set, it's safe to keep.
            if (!bannedChars.contains(c)) {
                // Append the safe character to our result.
                result.append(c);
            }
        }

        // Step 6: Print the final, filtered string.
        System.out.println(result.toString());
        
        sc.close();
    }
}