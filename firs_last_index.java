import java.util.*;

public class firs_last_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the number you want to search: ");
        int data = scn.nextInt();
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            int i, j;

            if (data > arr[m]) {
                l = m + 1;
            } else if (data < arr[m]) {
                h = m - 1;
            } else {
                i = j = m;
                while (arr[j] < data - 1 && arr[i] > data + 1) {

                    i++;

                    j--;

                }
                System.out.println("Start index: " + j);
                System.out.println("End index: " + i);

            }
        }
        System.out.print("Not found");

    }

}
/*
 * import java.util.*;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner scn = new Scanner(System.in);
 * System.out.print("Enter the array size: ");
 * int n = scn.nextInt();
 * int[] arr = new int[n];
 * System.out.println("Enter the Elements in array:");
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = scn.nextInt();
 * }
 * System.out.print("Enter the number you want to search: ");
 * int data = scn.nextInt();
 * int l = 0;
 * int h = arr.length - 1;
 * while (l <= h) {
 * int m = (l + h) / 2;
 * int i, j;
 * 
 * if (data > arr[m]) {
 * l = m + 1;
 * } else if (data < arr[m]) {
 * h = m - 1;
 * } else {
 * i = j = m;
 * 
 * 
 * while (arr[j] >= l && arr[i] <= h) {
 * if (data == arr[i + 1]) {
 * i++;
 * 
 * }
 * if (data == arr[j - 1]) {
 * j--;
 * 
 * }
 * System.out.println("Start index: " + j);
 * System.out.println("End index: " + i);
 * 
 * return;
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 * System.out.print("Not found");
 * 
 * }
 * 
 * }
 */