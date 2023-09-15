import java.util.*;

public class reverse_of_array {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scn.nextInt();

        System.out.println("Enter the values in array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("After Reversing the array:");
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int val : arr) {
            System.out.println(val);
        }

    }

}
