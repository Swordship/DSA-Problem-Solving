import java.io.*;
import java.util.*;

public class Solution {

    public static void firstNonRepeatingCharacter(String s) {
        
        HashMap<Character, Integer> charCounts = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
        
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }
        
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (charCounts.get(ch) == 1) {
                System.out.println(ch); 
                found = true;           
                break;                  
            }
        }
        
        if (!found) {
            System.out.println("All the characters are repetitive");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
                
        firstNonRepeatingCharacter(str);

    }
}