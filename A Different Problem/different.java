//Kattis: https://open.kattis.com/problems/different
import java.util.Scanner;

public class different {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLong()) {
      long n1 = sc.nextLong(), n2 = sc.nextLong();

      System.out.println(Math.abs(n1 - n2));
    }

    sc.close();
  }
}
