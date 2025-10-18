import java.util.*;

public class TrapeziumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1;
        int total = n * (n + 1);
        int end = total;

        for (int i = 0; i < n; i++) {
            int count = n - i;
            for (int d = 0; d < i * 2; d++) {
                System.out.print("-");
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start++);
                if (j != count - 1){
                    System.out.print("*");
                }
            }
            System.out.print("*");
            int temp = end - count + 1;
            for (int j = 0; j < count; j++) {
                System.out.print(temp + j);
                if (j != count - 1) System.out.print("*");
            }

            end -= count; 

            System.out.println(); 
        }
    }
}