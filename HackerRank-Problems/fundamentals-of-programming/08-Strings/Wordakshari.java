import java.io.*;
import java.util.*;

public class Wordakshari {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        int i=0;
        int c=0;
        while(true){
            arr[i] = sc.nextLine();
            if(arr[i].equals("####")){
                break;
            }i++;
            c++;
        }
        System.out.println(arr[0]);
        for(i=0;i<c;i++){
            
            if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0)){
                System.out.println(arr[i+1]);
            }else{
                break;
            }
        }
    }
}