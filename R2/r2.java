//Kattis: https://open.kattis.com/problems/r2
import java.util.Scanner;

public class r2{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int r1 = sc.nextInt(), s = sc.nextInt();
        
        System.out.println(2 * s - r1);
        
        sc.close();
    }
    
}
