import java.io.*;
import java.util.*;

public class countthevowels {
    
    public static int vowleCount(String s ){
        
        String s1 = s.toLowerCase();
        int volc = 0;
        for(int  i=0 ;i< s1.length();i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i'||s1.charAt(i)=='o'|| s1.charAt(i) == 'u'){
                volc++;
            }
        }
        return volc;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        System.out.println("Number of vowels: "+vowleCount(str));
        
        
    }
}