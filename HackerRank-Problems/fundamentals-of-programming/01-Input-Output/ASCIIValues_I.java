import java.io.*;
import java.util.*;

public class ASCIIValues_I {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        char str = sc.next().charAt(0);
        int ascii = (int)str;
        System.out.println(ascii);
    }
}