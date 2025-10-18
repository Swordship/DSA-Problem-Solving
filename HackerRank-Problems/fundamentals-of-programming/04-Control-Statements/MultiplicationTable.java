import java.io.*;
import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println("Enter n");
        System.out.println("Enter m");
        System.out.println("The multiplication table of "+n+" is");
        for(int i=1;i<=m;i++){
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
}