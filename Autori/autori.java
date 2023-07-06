import java.util.Scanner;

public class autori {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String in = sc.nextLine();
        
        for (int i = 0; i < in.length(); i++) {
            if (Character.isUpperCase(in.charAt(i)))
                System.out.print(in.charAt(i));
        }

        sc.close();
    }
}
