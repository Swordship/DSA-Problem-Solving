import java.io.*;
import java.util.*;

public class NumberSeries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i=1;i<=n;i++){
            if(i%2 ==0){
                res = (int) Math.pow(i,2)-2;
                System.out.print(res+" ");
            }else{
                res = (int) Math.pow(i,2)-1;
                System.out.print(res+" ");
            }
        }
    }
}