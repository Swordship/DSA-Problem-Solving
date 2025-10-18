import java.io.*;
import java.util.*;

public class UniformityMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i =0 ;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }
        int countodd = 0;
        int counteven =0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==0){
                    counteven++;
                }else{
                    countodd++;
                }
            }
        }
        
        if(counteven>0 && countodd>0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}