import java.io.*;
import java.util.*;

public class TimeSheet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int hours[] = new int[7];
        for(int i=0 ;i<7;i++){
            hours[i] = sc.nextInt();
        }
        int ts = 0;
        
        for(int i=0;i<7;i++){
            int dayhours = hours[i];
            int basesala = dayhours * 100;
            int extra = 0;
            
            
            if(dayhours >8){
                extra = (dayhours - 8)*15;
                
            }
            int total =  basesala+extra;
            
            if(i == 0 ){
                total += (total*50) /100;
            }
            if(i==6){
                total += (total*25)/100;
                
            }
            ts += total;
            
        }
        System.out.println(ts);
        
    }
}