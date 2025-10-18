import java.io.*;
import java.util.*;

public class AmoebaMultiplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pre = 0,cur = 1,next=0;
        if(n ==1 ){
            System.out.println(0);
        }else if(n==2){
            System.out.println(1);
        }else{
            
            for(int i=3;i<=n;i++){
                next = pre+cur;
                pre=cur;
                cur = next;
                
            }
            System.out.println(next);
        }
        
        
        
    }
}