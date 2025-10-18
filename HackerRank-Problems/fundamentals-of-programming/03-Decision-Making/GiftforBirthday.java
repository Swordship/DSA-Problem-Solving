import java.io.*;
import java.util.*;

public class GiftforBirthday {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val % 4 == 0&& val % 100 != 0|| val %400 == 0){
            System.out.println(val+" is a leap year");
        }else{
            System.out.println(val+" is not a leap year");
        }
        
    }
}