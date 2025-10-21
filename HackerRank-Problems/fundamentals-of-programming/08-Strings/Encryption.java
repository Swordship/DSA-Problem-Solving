import java.io.*;
import java.util.*;

public class Encryption {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        
        
        char[] codearr = code.toCharArray();
        
        for(int  i=0 ;i<codearr.length-1;i+=2){
            
            char temp = codearr[i];
            codearr[i] = codearr[i+1];
            codearr[i+1] = temp;
        }
        
        String str = new String(codearr);
        System.out.println(str);
    }
}