//Solution uses a union-find approach
import java.util.*;

public class countingstars {
   private static int[] parent, size;
   private static boolean[] isOpen;
   private static int openCount;
   
   private static int root(int i) {
      if (i != parent[i]) {
         parent[i] = root(parent[i]);
      }
      return parent[i];
   }
   
   public static void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        
        if (i == j) return;
        
        if(size[i] < size[j]) {
            parent[i] = j;
            size[j] += size[i];
        } else {
            parent[j] = i;
            size[i] += size[j];
        }
        
        openCount--;
   }
   
   public static int indexOf(int row, int m, int col) {
      return row * m + col;
   }
   
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int caseNumber = 1;
      while (sc.hasNext()) {
         int N = sc.nextInt(), M = sc.nextInt();
         parent = new int[N * M];
         size = new int[N * M];
         isOpen = new boolean[N * M];
         openCount = 0;
         
         sc.nextLine();
         
         for (int i = 0; i < N * M; i++) {
            parent[i] = i;
            size[i] = 1;
         }
         for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < M; j++) {
               char c = row.charAt(j);
               if (c == '-') {
                  int index = indexOf(i, M, j);
                  isOpen[index] = true;
                  openCount++;
                  
                  if (i > 0 && isOpen[index - M]) {
                     union(index, index - M);
                  }
                  if (i < N - 1 && isOpen[index + M]) {
                     union(index, index + M);
                  }
                  if (j > 0 && isOpen[index - 1]) {
                     union(index, index - 1);
                  }
                  if (j < M - 1 && isOpen[index + 1]) {
                     union(index, index + 1);
                  }
                  
               }
            }
         }
         System.out.println("Case " + caseNumber + ": " + openCount);
         caseNumber++;
      }
      
      sc.close();
      
   }
}
