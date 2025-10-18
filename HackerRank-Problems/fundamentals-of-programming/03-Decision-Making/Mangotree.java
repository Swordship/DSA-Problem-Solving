import java.io.*;
import java.util.*;

public class Mangotree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int tree = sc.nextInt();
        
        if(tree%col == 0||tree%col == 1||tree <= col && tree >0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}