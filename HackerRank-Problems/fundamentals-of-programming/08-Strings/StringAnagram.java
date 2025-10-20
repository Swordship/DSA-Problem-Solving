import java.io.*;
import java.util.*;

public class StringAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;
        }
        
        int [] chco = new int[26];
        
        for(char ch : str1.toCharArray()){
            chco[ch - 'a']++;
        }
        for(char ch : str2.toCharArray()){
            chco[ch - 'a']--;
        }
        
        for(int coun : chco){
            if(coun != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        
        System.out.println("Anagram");
    }
}