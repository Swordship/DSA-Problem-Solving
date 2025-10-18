import java.io.*;
import java.util.*;

public class Numberofdigits {
    
    
    public static int numofdigit(int n){
        if(n<10){
            return 1;
        }
        
        return 1+numofdigit(n/10);
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        System.out.println("The number of digits in "+n+" is "+numofdigit(n));
    }
}