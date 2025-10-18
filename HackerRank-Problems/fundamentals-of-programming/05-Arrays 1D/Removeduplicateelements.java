import java.io.*;
import java.util.*;

public class Removeduplicateelements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            
        }
        Set<Integer> hs= new LinkedHashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        for(int num:hs){
            System.out.println(num);
        }
        
    }
}