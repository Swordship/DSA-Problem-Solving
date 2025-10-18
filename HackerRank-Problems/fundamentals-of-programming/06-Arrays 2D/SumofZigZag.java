import java.io.*;
import java.util.*;

public class SumofZigZag {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += arr[0][i];
            sum += arr[n-1][i];
        }
        for(int i=1;i<n-1;i++){
            sum +=arr[i][n-1-i];
        }
        
        System.out.println("Sum of Zig-Zag pattern is "+sum);
    }
}