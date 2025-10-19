import java.io.*;
import java.util.*;

public class DecimalToBinary {

    public static void convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return;
        } else {
            convertToBinary(decimalNumber / 2);
            
            System.out.print(decimalNumber % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        if (number == 0) {
            System.out.print("0");
        } else {
            convertToBinary(number);
        }
        
        System.out.println(); 
        
    }
}