import java.util.*;

public class Toyland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] houses = new int[n][2]; 
        for (int i = 0; i < n; i++) {
            houses[i][0] = sc.nextInt();
            houses[i][1] = sc.nextInt(); 
        }

        Arrays.sort(houses, Comparator.comparingInt(a -> a[1]));

        int maxGap = -1;
        int h1 = -1, h2 = -1;

        for (int i = 0; i < n - 1; i++) {
            int gap = houses[i + 1][1] - houses[i][1];
            if (gap > maxGap) {
                maxGap = gap;
                h1 = houses[i][0];
                h2 = houses[i + 1][0];
            }
        }

        if (h1 < h2)
            System.out.println(h1 + " " + h2);
        else
            System.out.println(h2 + " " + h1);
    }
}