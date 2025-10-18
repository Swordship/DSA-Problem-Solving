import java.io.*;
import java.util.*;

public class SumofPositiveOddNumbers {
    
    public static int sumofpostiveodd(int n,int[] arr){
        if(n==0){
            return 0;
        }
        
        int sumofrest = sumofpostiveodd(n-1,arr);
        
        int current = arr[n-1];
        
        if(current > 0 && current % 2 !=0){
            
            return current+sumofrest;
            
        }else{
            return sumofrest;
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int total = sumofpostiveodd(n , arr);
        
        System.out.println("Sum = "+total);
        
        
        
    }
}