import java.io.*;
import java.util.*;

public class Countdistinctelements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int count = 0;
        Set<Integer> hs = new HashSet<>();
        for(int num : arr){
            hs.add(num);
        }
        
        System.out.println("There are "+hs.size()+" distinct element in the array.");
    }
}