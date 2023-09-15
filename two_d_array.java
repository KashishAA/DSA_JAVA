import java.util.*;

public class two_d_array {
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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
