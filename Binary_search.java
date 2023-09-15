import java.util.*;

public class Binary_search {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enther the array size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enther the number you want to search: ");
        int data = scn.nextInt();
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;

            if (data > arr[m]) {
                l = m + 1;
            } else if (data < arr[m]) {
                h = m - 1;
            } else {
                System.out.print("found at Index: " + m);
                return;
            }

        }
        System.out.print("Not found");

    }

}
