import java.io.*;
import java.util.*;

public class CountthesumofnumbersinaString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int total = 0;
    
        StringBuilder currnum = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char currch = str.charAt(i);
            
            if(Character.isDigit(currch)){
                
                currnum.append(currch);
                
            }else{
                if(currnum.length()>0){
                    total+=Integer.parseInt(currnum.toString());
                    
                    currnum.setLength(0);
                }
            }
        }
        
        if(currnum.length()>0){
            total+=Integer.parseInt(currnum.toString());
        }
        
        System.out.println(total);
        
    }
}