import java.util.*;

public class froshweek2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int tasks = sc.nextInt(), quiet = sc.nextInt();
      
      sc.nextLine();
      
      String[] tIntervals = sc.nextLine().split(" ");
      String[] lIntervals = sc.nextLine().split(" ");
      
      Arrays.sort(tIntervals, Collections.reverseOrder());
      Arrays.sort(lIntervals, Collections.reverseOrder());
      
      int maxTasks = 0;
      int t = 0, l = 0;
      
      while (t < tIntervals.length && l < lIntervals.length) {
         if (Integer.valueOf(tIntervals[t]) <= Integer.valueOf(lIntervals[l])) {
            t++;
            l++;
            maxTasks++;
         }
         else if (Integer.valueOf(tIntervals[t]) > Integer.valueOf(lIntervals[l])) {
            t++;
         }
         else {
            t++;
            l++;
         }
      }
      System.out.println(maxTasks);
      
      sc.close();
   }
}
