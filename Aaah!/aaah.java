//Kattis: https://open.kattis.com/problems/aaah
import java.util.Scanner;

public class aaah {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String jm = sc.nextLine(), doc = sc.nextLine();
        
        sc.close();
        System.out.println(jm.length() >= doc.length() ? "go" : "no");
    }
}
