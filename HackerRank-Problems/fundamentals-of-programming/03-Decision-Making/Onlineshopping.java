import java.io.*;
import java.util.*;

public class Onlineshopping {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int dis = sc.nextInt();
        int cha = sc.nextInt();
        int price1 = sc.nextInt();
        int dis1 = sc.nextInt();
        int cha1 = sc.nextInt();
        int price2 = sc.nextInt();
        int dis2 = sc.nextInt();
        int cha2 = sc.nextInt();
        
        int flip = (int)(price -(price *dis /100))+cha;
        System.out.println("In Flipkart: Rs." +flip);
        int snap = (int)(price1 -(price1 *dis1 /100))+cha1;
        System.out.println("In Snapdeal: Rs." +snap);
        int amaz = (int)(price2 -(price2 *dis2 /100))+cha2;
        System.out.println("In Amazon: Rs." +amaz);
        
        if(flip<=snap && flip<=amaz){
            System.out.println("Choose Flipkart");
            
        }else if( snap<=flip && snap <= amaz){
            System.out.println("Choose Snapdeal");
        }else{
            System.out.println("Choose Amazon");
        }
        
    }
}