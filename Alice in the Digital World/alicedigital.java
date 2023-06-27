import java.util.Scanner;

public class alicedigital {

    public static int findWeight(int[] arr, int idx, int len) {
        int sumLeft = 0;
        int i = idx - 1;
        while (i >= 0 && arr[i] > arr[idx]) {
            sumLeft += arr[i];
            i--;
        }

        int sumRight = arr[idx];
        i = idx + 1;
        while (i < len && arr[i] > arr[idx]) {
            sumRight += arr[i];
            i++;
        }

        return sumLeft + sumRight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dataSets = sc.nextInt();

        for (int loop = 0; loop < dataSets; loop++) {
            int len = sc.nextInt();
            int min = sc.nextInt();

            int[] vals = new int[len];

            for (int i = 0; i < len; i++)
                vals[i] = sc.nextInt();

            int res = min;
            for (int i = 0; i < len; i++) {
                if (vals[i] == min) {
                    int tmp = findWeight(vals, i, len);
                    if (tmp > res) res = tmp;
                }
            }
          
            System.out.println(res);
        }
    }
}
