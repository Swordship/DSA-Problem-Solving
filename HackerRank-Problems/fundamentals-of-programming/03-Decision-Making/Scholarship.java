import java.io.*;
import java.util.*;

public class Scholarship {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        int year = sc.nextInt();
        int income = sc.nextInt();
        int arrer = sc.nextInt();
        float mark= sc.nextInt();
        float att = sc.nextInt();
        
        if(age>=18 && age<=21&&year>=2021&&income<=200000&&mark>=60&&att>=80&&arrer<=2){
            System.out.println("Eligible");
        }else if(age>=18 && age<=21&&year>=2021&&income>=200000&&income<=250000&&mark>=80&&att>=90&&arrer>2){
            System.out.println("Partially Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}