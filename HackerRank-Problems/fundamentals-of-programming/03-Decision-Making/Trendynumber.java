import java.util.*;

public class Trendynumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if (val >= 100 && val <= 999) {
            int middleDigit = (val / 10) % 10; 

            if (middleDigit % 3 == 0) {
                System.out.println("Trendy Number");
            } else {
                System.out.println("Not a Trendy Number");
            }
        } else {
            System.out.println("Invalid Number");
        }
    }
}