import java.util.Scanner;
import java.util.Arrays;
public class abc{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int[] arr = new int[nums.length];
        for(int i = 0; i < arr.length; i++){
          arr[i] = Integer.parseInt(nums[i]);
        }
        
        Arrays.sort(arr);
        
        for(char c : sc.nextLine().toCharArray()){
            if(c == 'A')
                System.out.print(arr[0]);
            if(c == 'B')
                System.out.print(arr[1]);
            if(c == 'C')
                System.out.print(arr[2]);
            System.out.print(" ");
        }
        
        sc.close();
    }
}
