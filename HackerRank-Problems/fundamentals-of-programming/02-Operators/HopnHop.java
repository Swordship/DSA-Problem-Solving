/*
Peter Rabbit lives in a colony. He is the only rabbit in his colony who is not able to hop. On his 5th birthday, his father Rabbit gifted him a pogo stick as he could not jump like the other rabbits. He is so excited to play with the pogo stick. The pogo stick hops one unit per jump. He wanders around his house jumping with pogo sticks. He wants to show the pogo stick to his friend and decides to go using his pogo stick. Write a program to find the number of hops needed to reach his friends' house (x,y). Assume that Peter Rabbit's house is in the coordinates (3,4).

Input Format

Input consists of two integers x and y.

Constraints

NA

Output Format

The output is an integer. It corresponds to the number of hops needed to reach his friend's house.

Sample Input 0

5 
10 
Sample Output 0

6
*/
import java.io.*;
import java.util.*;

public class HopnHop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Peter's friend's house coordinates
        int x = scanner.nextInt(); // Input x
        int y = scanner.nextInt(); // Input y

        // Peter's house coordinates are fixed
        int startX = 3;
        int startY = 4;

        // Calculate distance using the distance formula
        double distance = Math.sqrt(Math.pow(x - startX, 2) + Math.pow(y - startY, 2));

        // Round up to the nearest whole number since Peter can only hop in full units
        int hops = (int) Math.floor(distance);

        // Output the number of hops
        System.out.println(hops);
    }
}