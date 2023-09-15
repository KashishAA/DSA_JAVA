import java.util.*;

public class sub {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30 };
        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = i; j <= arr.length - 1; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "\t");

                }

                System.out.println();

            }

        }
    }
}
