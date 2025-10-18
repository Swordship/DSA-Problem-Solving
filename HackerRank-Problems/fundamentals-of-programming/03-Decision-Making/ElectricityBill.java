
import java.util.Scanner;

public class ElectricityBill {

public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    int a;
    a = Scanner.nextInt();
    if(a <= 200)
    {

        System.out.println("Rs."+ (int)(a * 0.5));
    }
    else if(a <= 400) 
    {
        System.out.println("Rs."+ (int)(a * 0.65 + 100));
    }
    else if(a <= 600)
    {
        System.out.println("Rs."+ (int)(a * 0.80 + 200));
    }
    else if(a > 600)
    {
        System.out.println("Rs."+ (int)(a * 1.25 + 425));
    }
}
}
1
