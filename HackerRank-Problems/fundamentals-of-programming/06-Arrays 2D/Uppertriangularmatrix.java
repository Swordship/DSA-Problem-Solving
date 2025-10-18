import java.io.*;
import java.util.*;

public class Uppertriangularmatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i =0 ; i<n ;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Boolean isup = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j&&arr[i][j]>0){
                    isup = true;
                    break;
                }
            }
        }
        
        
        if(isup){
            System.out.println("Not an Upper triangular matrix");
        }else{
            System.out.println("Upper triangular matrix");
        }
    }
}