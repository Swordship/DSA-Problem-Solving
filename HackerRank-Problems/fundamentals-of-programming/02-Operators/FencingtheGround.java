/*In Westeros, the fighting ground is rectangular in shape. The King of Westeros, 
Bran Stark decides to build a fence around the ground. In order to help the construction
workers to build a straight fence, he planned to place a thick rope around the ground. 
He decided to buy a rope of length that exactly fits the boundary. He also wanted to cover 
the entire ground with a thick carpet during the rainy season. The carpet should also be 
bought in such a way that it exactly covers the entire ground. Being the three-eyed Raven, 
he was lost in his thoughts and requested your help. Can you please help King Bran by writing 
a program to find the exact length of the rope and the exact area of the carpet that is required?

Hint: Area of rectangle = length * breadth perimeter of a rectangle = 2* (length + breadth)

Input Format

Input consists of 2 integers. The first integer corresponds to the length of the ground. The second integer corresponds to the breadth of the ground.

Constraints

length>0 breadth>0

Output Format

Refer to the sample Input and Output for exact formatting specifications

Sample Input 0

50
20
Sample Output 0

The required length is 140 m
The required area of carpet is 1000 sqm

*/
import java.io.*;
import java.util.*;

public class FencingtheGround {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner (System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        int rope = len*bre;
        int carpet = 2*(len+bre);
        System.out.println("The required length is "+carpet+" m");
        System.out.println("The required area of carpet is "+rope+" sqm");
    }
}