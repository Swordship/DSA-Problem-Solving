import java.util.Scanner;

public class CheckingAlphabets {

public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    char ch = Scanner.next().charAt(0);
    if((ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') || (ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u'))
    {
        System.out.println("Vowel");
    }
            else if((ch >='A' && ch <='Z') || (ch >='a' && ch <= 'z'))
            {
                System.out.println("Consonant");
            }
    else 
    {
        System.out.println("Not an alphabet");
    }

}
}