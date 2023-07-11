//Kattis: https://open.kattis.com/problems/cold

import java.util.*;

public class cold {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), count = 0;
        
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp < 0) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
