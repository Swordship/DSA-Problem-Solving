import java.io.*;
import java.util.*;

public class Reversea3-digitnumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int val = sc.nextInt();
        int a = 0;
        while(val!=0){
            int last = val%10 ;
            a = a * 10 + last ;
            val = val/ 10;
            
        }
        System.out.println(a);
        
    }
}