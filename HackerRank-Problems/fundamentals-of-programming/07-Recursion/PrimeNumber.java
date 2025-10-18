import java.io.*;
import java.util.*;

public class PrimeNumber {
    
    public static boolean isPrime(int n,int i){
        if(n % i ==0){
            return false;
        }
        
        if(i> n/2){
            return true;
        }        
        
        return isPrime(n , i+1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n <= 1 ){
            System.out.println("Not a Prime Number");
        }else{
            boolean res = isPrime(n,2);
            
            if(res){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not a Prime Number");
            }
        }
        
    }
}