import java.io.*;
import java.util.*;

public class GCDof2numbers {
    
    public static int GCD(int a, int b){
        
        if(a == 0){
            return b ;
            
        }
        
        return GCD(b%a,a);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(GCD(a,b));
    }
}