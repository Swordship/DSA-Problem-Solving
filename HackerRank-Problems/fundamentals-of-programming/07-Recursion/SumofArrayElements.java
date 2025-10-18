import java.io.*;
import java.util.*;

public class SumofArrayElements {
    
    public static int res(int n ,int[] arr){
        
        if(n == 0){
            return 0;
        }
        
        return arr[n-1] + res(n-1 , arr);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = res(n , arr);
        System.out.println(sum);
    }
}