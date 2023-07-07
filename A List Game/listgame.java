//Kattis: https://open.kattis.com/problems/listgame
import java.util.Scanner;
import java.util.*;

public class listgame {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      long n = sc.nextLong();
      int count = 0;
      
      while (n % 2 == 0) {
         count++;
         n /= 2;
      }
      
      for (int i = 3; i <= Math.sqrt(n); i += 2) {
         while (n % i == 0) {
            count++;
            n /= i;
         }
      }
      
      if (n > 2) {
         count++;
      }
      
      System.out.println(count);
      sc.close();
   }
}
