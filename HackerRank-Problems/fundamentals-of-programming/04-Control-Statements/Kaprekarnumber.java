import java.io.*;
import java.util.*;

public class Kaprekarnumber {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int sum=0;
        int temp=n;
        while(n>0){
            sum ++ ;
            n=n/10;
        }
        int div=(int)Math.pow(10,sum);
        int left=sq/div;
        int right=sq%div;
        if(temp==(left+right)){
            System.out.println("Kaprekar Number");
        }else{
            System.out.println("Not a Kaprekar Number");
        }
    }
}