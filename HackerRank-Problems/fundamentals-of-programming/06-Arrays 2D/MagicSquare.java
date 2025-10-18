import java.io.*;
import java.util.*;

public class MagicSquare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        if (n == 1) {
            System.out.println("Yes");
            return;
        }
        
        int magicsum = 0;
        for(int i=0;i<n;i++){
            magicsum += arr[0][i];
        }
        
        for(int i=0;i<n;i++){
            int rowsum =0;
            for(int j=0;j<n;j++){
                rowsum+=arr[i][j];
            }
            
            if(rowsum != magicsum){
                System.out.println("No");
                return;
            }
        }
        
        for(int  i=0;i<n;i++){
            int colsum =0;
            for(int j=0;j<n;j++){
                colsum+= arr[j][i];
            }
            if(colsum != magicsum){
                System.out.println("No");
                return;
            }
        }
        int dia =0;
        for(int i=0;i<n;i++){
            dia+= arr[i][i];
            
            
        }
        if(dia!= magicsum){
                System.out.println("No");
                return;
        }
        int antidia =0;
        for (int i = 0; i < n; i++) {
            antidia+= arr[i][n - 1 - i];
        }
        if (antidia != magicsum) {
            System.out.println("No");
            return;
        }
        
        
        
        System.out.println("Yes");
        
        
        
        
    }
}