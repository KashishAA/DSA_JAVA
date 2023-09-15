import java.util.*;

public class sub_array {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = { 10, 20, 30 };
        for (int i = 0; i <= arr.length - 1; i++) {
            count = 0;
            for (int j = 0; j <= i; j++) {
                count++;
                System.out.print(arr[j] + "\t");
                if (count == arr.length) {
                    System.out.println();

                    for (int x = 1; x <= arr.length - 1; x++) {
                        System.out.print(arr[x] + "\t");

                    }
                    System.out.println();
                }
            }

            System.out.println();
        }
    }
}
