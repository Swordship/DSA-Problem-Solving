import java.io.*;
import java.util.*;

public class RoundOff {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float val = sc.nextFloat();

        int original = (int) val;                  
        int ceil = (int) Math.ceil(val);           
        int floor = (int) Math.floor(val);         

        System.out.println(original);
        System.out.println(ceil);
        System.out.println(floor);
    }
}