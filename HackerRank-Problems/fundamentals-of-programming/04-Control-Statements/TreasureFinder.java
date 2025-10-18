import java.io.*;
import java.util.*;

public class TreasureFinder {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(((a>b)&&(a<c))||((a>c)&&(a<b))){
      System.out.println("The treasure is in the box which has the number "+a);}
     else if(((b>a)&&(b<c))||((b>c)&&(b<a))){
       System.out.println("The treasure is in the box which has the number "+b);}
      else{
        System.out.println("The treasure is in the box which has the number "+c);}
    if((b%a==0)&&(c%a==0)){
      System.out.println("The code to open the box is "+a);}
    else
      System.out.println("The code to open the box is 1");
      
    }
}