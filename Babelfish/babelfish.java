//Kattis: https://open.kattis.com/problems/babelfish
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class babelfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> babelFish = new HashMap<>();

        while (sc.hasNext()) {
            String in = sc.nextLine();

            if (in.isEmpty()) {
                continue;
            }

            if (in.contains(" ")) {
                String[] temp = in.split(" ");
                String key = temp[1], value = temp[0];
                babelFish.put(key, value);
            } else {
                String translation = babelFish.getOrDefault(in, "eh");
                System.out.println(translation);
            }
        }
        sc.close();
    }
}
