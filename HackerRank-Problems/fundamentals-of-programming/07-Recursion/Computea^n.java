import java.io.*;
import java.util.*;

public class Computea^n {

    public static int power(int a,int n){
        
        
        
        if(n ==0){
            return 1;
        }
            
            
        return a*(power(a ,n -1));
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println("The value of "+a+" power "+n+" is "+power(a,n));
        
    }
}