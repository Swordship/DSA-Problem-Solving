import java.io.*;
import java.util.*;

public class MaximumElementinanArray {
    
    public static int maxfind(int n,int[] arr){
        if(n==0){
            return arr[0];
        }
        
        int max = maxfind(n-1,arr);
        
        int current = arr[n-1];
        
        return Math.max(current,max);
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = maxfind( n , arr);
        
        System.out.println("Maximum element in the array is "+max);
    }
}