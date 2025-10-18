import java.io.*;
import java.util.*;

public class MatrixRotation {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int arr[][] = new int [n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //transpose matrix
        
        for(int i=0;i<n;i++){
            int temp =0;
            for(int j=i;j<n;j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp; 
            }
        }
        
        //reverse matrix
        
        
        for(int i=0;i<n;i++){
            int start = 0;
            int end = n-1;
            
            while (start<end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                
                
                start++;
                end--;
            }
        
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}