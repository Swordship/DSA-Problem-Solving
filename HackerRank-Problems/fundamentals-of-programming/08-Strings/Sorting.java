import java.io.*;
import java.util.*;

public class Sorting {
    
    public static char[] findSortedString(String s) {
    int len = s.length();
    char[] str = s.toCharArray();
    for (int i = 0; i < len - 1; i++) {
        for (int j = 0; j < len - i - 1; j++) {
            if (str[j] > str[j + 1]) {
                char temp = str[j];
                str[j] = str[j + 1];
                str[j + 1] = temp;
            }
        }
    }
    return str;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        
        System.out.println(findSortedString(str));
        
    }
}