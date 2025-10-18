import java.io.*;
import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int r = val-1;
        
        int row = r / 3;
        int col = r%3;
        System.out.println(row+" "+col);
    }
}