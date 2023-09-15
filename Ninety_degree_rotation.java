import java.util.*;

public class Ninety_degree_rotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array row size:");
        int nr = scn.nextInt();
        System.out.print("Enter array column size:");
        int nc = scn.nextInt();

        int[][] arr = new int[nr][nc];
        System.out.println("Enter array values:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("values:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        // transpose array:::
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // swap::

        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr.length - 1;
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;

            }
        }

        System.out.println("Output");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

}
