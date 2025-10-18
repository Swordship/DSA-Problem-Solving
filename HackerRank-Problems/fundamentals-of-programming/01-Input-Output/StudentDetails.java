import java.io.*;
import java.util.*;

public class StudentDetails {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float gpa= sc.nextFloat();
        char grade = sc.next().charAt(0);
        Double pa = Math.floor(gpa*100)/100;
        System.out.printf("Name: %s\nAge: %d\nCGPA: %.2f\nGrade: %c",name,age,pa,grade);
        
    }
}