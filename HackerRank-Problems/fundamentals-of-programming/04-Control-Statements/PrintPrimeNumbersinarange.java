import java.io.*;
import java.util.*;

public class PrintPrimeNumbersinarange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            int ch = 0;
            for(int j =2;j<i;j++){
                if(i%j ==0){
                    ch++;
                    break;
                }
            }if(ch ==0){
                System.out.print(i+" ");
            }   
        }
    }
}