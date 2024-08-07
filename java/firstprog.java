import java.util.Scanner;

public class firstprog {
    public static void main(String[] args) {
      int n1 = factor();
      if (n1==2) {
         System.out.println("the number is prime");
      }
      else System.out.println("the number is composite");
}
   public static int factor() {
      Scanner scn = new Scanner (System.in);
      int n = scn.nextInt(); int count = 0;
      for(int i = 1; i<=n; i++) {
         if (n%i == 0) {
         count++;
         }
      }
      return count;
   }
}
