import java.util.*;

public class water_traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int n = scn.nextInt();
        System.out.print("Enter number of columns: ");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        System.out.print("Enter the values: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("the array:");

        System.out.println("the wave array is::");

        for (int j = 0; j < arr[0].length; j++) {

            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }

            }
        }
    }
}
