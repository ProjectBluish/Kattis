//Kattis: https://open.kattis.com/problems/airconditioned

import java.util.*;

class SortPref implements Comparator<int[]> {
    public int compare(int[] arr1, int[] arr2) {
        return arr1[1] > arr2[1] ? 1 : arr1[1] < arr2[1] ? -1 : arr1[0] > arr2[0] ? 1 :arr1[0] < arr2[0] ? -1 : 0;
    }
}

public class airconditioned {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numMinions = sc.nextInt();
        int[][] tempPref = new int[numMinions][2];

        for (int i = 0; i < numMinions; i++) {
            tempPref[i][0] = sc.nextInt();
            tempPref[i][1] = sc.nextInt();
        }
        Arrays.sort(tempPref, new SortPref());

        int maxUpper = tempPref[0][1];
        int rooms = 1;

        for (int i = 1; i < numMinions; i++) {
            int lower = tempPref[i][0];

            if (maxUpper < lower) {
                maxUpper = tempPref[i][1];
                rooms++;
            }
        }

        System.out.println(rooms);
        sc.close();
    }
}


