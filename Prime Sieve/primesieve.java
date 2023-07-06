import java.util.*;

public class primesieve {
   private static BitSet prime;

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      String[] temp = sc.nextLine().split(" ");

      int n = Integer.parseInt(temp[0]), q = Integer.parseInt(temp[1]);
      sieve(n);

      int primeCount = 0;
      for (int i = 2; i <= n; i++) {
         if (isPrime(i)) {
            primeCount++;
         }
      }

      System.out.println(primeCount);

      for (int i = 0; i < q; i++) {
         int x = sc.nextInt();
         System.out.println(isPrime(x) ? "1" : "0");
      }
   }

   private static void sieve(int n) {
      prime = new BitSet(n + 1);
      prime.set(0, n + 1);

      for (int j = 2; j * j <= n; j++) {
         if (prime.get(j)) {
            for (int k = j * j; k <= n; k += j) {
               prime.clear(k);
            }
         }
      }
   }

   private static boolean isPrime(int x) {
      if (x < 2) {
         return false;
      }
      return prime.get(x);
   }
}
