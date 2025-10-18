import java.util.*;

public class Sumofdigittillsingledigit {

public static void main(String[] args) {
    Scanner sn =new Scanner(System.in);
    int num =sn.nextInt();
    int sum=0;
    while(num>9)
    {
        while(num>0)
        {
        sum+=num%10;
        num=num/10;
        }
        num=sum;
        sum=0;

    }
    System.out.println(num);
}
}