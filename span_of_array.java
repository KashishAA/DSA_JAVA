import java.io.*;
import java.util.*;

public class span_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        spanOfArray(arr);

    }

    public static void spanOfArray(int arr[]) {
        int high = arr[0];
        int low = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (high < arr[i]) {

                high = arr[i];

            }
            if (low > arr[i]) {
                low = arr[i];

            }
        }
        System.out.print("highest value is :" + high);
        System.out.println();
        System.out.print("lowest value: " + low);

        int span = high - low;
        System.out.println();
        System.out.print("the span of array is: " + span);

    }

}
