import java.util.*;

public class HotelTariffCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int roomrent = sc.nextInt();
        int noofdays = sc.nextInt();
        double cost = 0;

        if (month > 0 && month <= 12) {
            if (month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
                cost = roomrent * 1.2 * noofdays;  // Apply 20% surcharge
            } else {
                cost = roomrent * noofdays; // Normal months
            }
            System.out.print((int) cost);
        } else {
            System.out.print("Invalid Input");
        }
    }
}
