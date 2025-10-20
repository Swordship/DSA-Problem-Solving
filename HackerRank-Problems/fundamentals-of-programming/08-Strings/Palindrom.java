import java.io.*;
import java.util.*;

public class Palindrom {
    
    
    public static void isPalindrom(String s ){
        
        StringBuilder s1 = new StringBuilder(s).reverse();
        
        if(s.equals(s1.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        isPalindrom(str);
        
    }
}