import java.util.Scanner;

public class FirstProg {

   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("enter the array size");
      int n = scn.nextInt();
      int [] arr = new int [n];
      System.out.println("enter the array elements");
      for(int i = 0; i<n; i++) {
            arr[i] = scn.nextInt();
      }
      int m = max(arr); 
      System.out.println(count(arr, m));
      
}
public static int max(int [] arr) {
      int max = arr[0];
      for(int i = 1; i<arr.length; i++) {
            if (arr[i] > max) {
                  max = arr[i];
            }
      }
      return max;
}
public static int count(int [] arr, int max ) {
      int count = 0;
      int m = max(arr);
      for(int i = 0; i<arr.length; i++){
            if (arr[i] < m) {
                  count ++;
            }
      }
      return count;
}
}
      

    
   

