import java.util.Scanner;
class Moveallzeroes{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] arr = new int[a];
    for(int i=0;i<a;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<a;i++){
      int number = arr[i];
      String ab = "";
      String bc = "";
      while(number>0){
        int r = number%10;
        if(r==0){
          ab = ab + "0";
        }
        else{
          bc = bc + "1";
        }
        number = number/10;
      }
      System.out.println(bc+ab); 
    }
  }
}