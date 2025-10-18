import java.io.*;
import java.util.*;

public class SpiralPattern {
    
    
    public static List<Integer> sprialOrder(int[][] arr){
        
        
        List<Integer> result = new ArrayList<>();
        
        if(arr == null || arr.length == 0){
            return result;
        }
        
        int top =0;
        int bottom = arr.length - 1;
        int left =0;
        int right = arr[0].length -1;
    
        while(top <= bottom && left <=right){
            
            //right traversal
            
            for(int i= left ;i<= right;i++){
                result.add(arr[top][i]);
            }
            top++;
            
            //down traversal
            for(int i=top;i<= bottom;i++){
                result.add(arr[i][right]);
            }
            right--;
            
            if(top<=bottom){
                //traver left to right
                for(int i=right ;i>=left;i--){
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                //traver down to top
                for(int i =bottom ;i>=top;i--){
                    result.add(arr[i][left]);
                }
                left++;
            }
            
        }
        return result;
    
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        int [][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        List<Integer> spiral = sprialOrder(arr);
        
        
        for (int i = 0; i < spiral.size(); i++) {
            System.out.print(spiral.get(i) + (i == spiral.size() - 1 ? "" : " "));
        }
        System.out.println();
        
        
        
    }
}