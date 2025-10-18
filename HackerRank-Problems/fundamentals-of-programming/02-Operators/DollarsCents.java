/*
Kamal was traveling from Korea to USA and he was not aware of the currency system of USA. Can you please help him to add two dollars and cents?

Note: 1 dollar=100 cents

Input Format

Input consists of 4 integers. The first two inputs correspond to the value of the first dollar and cent. The next two inputs correspond to the value of the second dollar and cent.

Constraints

NA

Output Format

The output should print the sum of dollars and cents.

Sample Input 0

30
10
140
99
Sample Output 0

171
9
Sample Input 1

99
99
99
99
Sample Output 1

199
98
*/
import java.io.*;
import java.util.*;

public class  DollarsCents {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int doll = sc.nextInt();
        int cent = sc.nextInt();
        int doll1 = sc.nextInt();
        int cent1 = sc.nextInt();
        
        int total_cent = cent+cent1;
        int total_dollar = doll+doll1+(total_cent/100);
        int remainig = total_cent%100;
        
        System.out.println(total_dollar+"\n"+remainig);
        
    }
}