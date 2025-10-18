import java.io.*;
import java.util.*;

public class Maximumelementineachcolumn {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        
        
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=0;j<m;j++){
                if(arr[j][i]>max){
                    max = arr[j][i];
                }
            }
            System.out.println(max);
        }
    }
}