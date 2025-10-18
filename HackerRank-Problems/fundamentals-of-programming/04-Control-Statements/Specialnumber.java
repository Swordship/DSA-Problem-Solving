import java.io.*;
import java.util.*;

public class Specialnumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;
        int pro = 0;
        int res=0;
        for(int i =m;i<=n;i++){
            int fir =i/10;
            int las =i%10;
            sum = fir+las;
            pro = fir*las;
            res = sum+pro;
            if(res == i){
                System.out.println(i);
            }
        }
    }
}