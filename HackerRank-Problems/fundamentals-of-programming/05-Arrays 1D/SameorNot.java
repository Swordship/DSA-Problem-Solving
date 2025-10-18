import java.io.*;
import java.util.*;

public class SameorNot {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[] = new int[m];
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        int suma = 0;
        for(int i=0;i<n;i++){
            suma+= a[i];
        }
        int sumb = 0;
        for(int i=0;i<m;i++){
            sumb+= b[i];
        }
        
        
        if(suma == sumb&&n==m){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
    }
}