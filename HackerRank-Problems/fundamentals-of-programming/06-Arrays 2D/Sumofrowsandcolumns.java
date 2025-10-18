import java.io.*;
import java.util.*;

public class Sumofrowsandcolumns {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> listrow = new ArrayList<>();
        List<Integer> listcol = new ArrayList<>();
        int n=sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //sum of rows
        for(int i=0;i<n;i++){
            int rowsum =0;
            for(int j=0;j<n;j++){
                rowsum += arr[i][j];
            }
            listrow.add(rowsum);
        }
        
        //sum of col
        for(int i=0;i<n;i++){
            int colsum =0;
            for(int j=0;j<n;j++){
                colsum += arr[j][i];
            }
            listcol.add(colsum);
        }
        
        System.out.print("The Sum of rows is ");
        for(int lis : listrow){
            System.out.print(lis+" ");
        }
        System.out.println();
        int maxrowsum = listrow.get(0);
        int maxrowindex = 0;
        for(int i=1;i<listrow.size();i++){
            if(listrow.get(i) >maxrowsum){
                maxrowsum = listrow.get(i);
                maxrowindex =i;
            }
        }
        
        System.out.println("Row "+(maxrowindex+1)+" has a maximum sum");
        
        System.out.print("The Sum of columns is ");
        for(int lis : listcol){
            System.out.print(lis+" ");
        }
        System.out.println();
        int maxcolsum = listcol.get(0);
        int maxcolindex = 0;
        for(int i=1;i<listcol.size();i++){
            if(listcol.get(i) >maxcolsum){
                maxcolsum = listcol.get(i);
                maxcolindex = i;
            }
        }
        
        System.out.println("Column "+(maxcolindex+1 )+" has the maximum sum");
        
    }
}