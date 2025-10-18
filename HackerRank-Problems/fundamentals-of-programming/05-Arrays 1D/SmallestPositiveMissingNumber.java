import java.io.*;
import java.util.*;

public class SmallestPositiveMissingNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : arr){
            if(num>0){
                set.add(num);
            }
        }
        
        int smallest = 1;
        while(true){
            if(!set.contains(smallest)){
                System.out.println(smallest);
                break;
            }
            smallest++;
        }
    }
}