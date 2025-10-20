import java.io.*;
import java.util.*;

public class StringSubsequence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        //Two pointer approach
        int  i=0; // pointer one for s
        int  j=0; // pointer two for t
        while(i<s.length()){
            
            if(s.charAt(i) == t.charAt(j)){
                
                i++;
                j++;
                
            }else{
                i++;
            }
        }
        
        if(j == t.length()){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}