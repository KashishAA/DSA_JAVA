import java.util.*;

public class broken_economy {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int data = 90;

        int lo = 0;
        int hi = arr.length - 1;
        int ceil = 0;
        int floor = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            } else if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;

            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
/*
 * for (int i = 0; i <= arr.length - 1; i++) {
 * if (data == arr[i]) {
 * System.out.println("floor: " + arr[i]);
 * System.out.println("Seil: " + arr[i]);
 * break;
 * } else if (data < arr[i]) {
 * int j = i - 1;
 * System.out.println("floor: " + arr[j]);
 * System.out.println("seil: " + arr[i]);
 * break;
 * 
 * }
 * 
 * }
 */