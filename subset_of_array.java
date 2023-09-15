import java.util.*;

public class subset_of_array {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array element: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scn.nextInt();
        }
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String st = "";
            int temp = i;
            for (int j = arr.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    st = "-\t" + st;
                } else {
                    st = arr[j] + "\t" + st;
                }
            }
            System.out.println(st);
        }
    }
}
