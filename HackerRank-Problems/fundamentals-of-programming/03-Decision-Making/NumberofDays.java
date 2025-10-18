import java.util.*;

public class NumberofDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();  
        int month = sc.nextInt(); 
        int jan = 31, feb = 28, mar = 31, apr = 30, may = 31, jun = 30;
        int jul = 31, aug = 31, sep = 30, oct = 31, nov = 30, dec = 31;
        if (year >= 1900 && year <= 9999) {
            if (month >= 1 && month <= 12) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    feb = 29;
                }
                int days = 0;
                if (month == 1) days = jan;
                else if (month == 2) days = feb;
                else if (month == 3) days = mar;
                else if (month == 4) days = apr;
                else if (month == 5) days = may;
                else if (month == 6) days = jun;
                else if (month == 7) days = jul;
                else if (month == 8) days = aug;
                else if (month == 9) days = sep;
                else if (month == 10) days = oct;
                else if (month == 11) days = nov;
                else if (month == 12) days = dec;

                System.out.println(days + " Days");
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}