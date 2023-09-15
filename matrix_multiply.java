import java.util.*;

public class matrix_multiply {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // MATRIX 1 SIZE
        System.out.print("MATRIX 1-- Row size: ");
        int mr1 = scn.nextInt();
        System.out.print("MATRIX 1-- Column size: ");
        int mc1 = scn.nextInt();
        // MATRIX 2 SIZE:
        System.out.print("MATRIX 2-- Row size: ");
        int mr2 = scn.nextInt();
        System.out.print("MATRIX 2-- Column size: ");
        int mc2 = scn.nextInt();
        // CHECKING CONDITION
        if (mc1 == mr2) {
            System.out.println("Enter the data as per requirement::");
        } else {
            System.out.print("NOT VALID");
        }
        // TAKING INPUT OF MATRIX 1
        int[][] arr1 = new int[mr1][mc1];
        System.out.println("Enter the values MATRIX 1: ");
        for (int i = 0; i < mr1; i++) {
            for (int j = 0; j < mc1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        System.out.println(" MATRIX 2: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // TAKING INPUT OF MATRIX 2:

        int[][] arr2 = new int[mr2][mc2];

        System.out.println("Enter the values MATRIX 2: ");
        for (int i = 0; i < mr2; i++) {
            for (int j = 0; j < mc2; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }
        System.out.println(" MATRIX 2: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int[][] arr3 = new int[mr1][mc2];
        for (int i = 0; i < mr1; i++) {
            for (int j = 0; j < mc2; j++) {

                for (int k = 0; k < mc1; k++) {
                    sum += arr1[i][k] * arr2[k][j];

                }
                arr3[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("Output");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();

        }
    }
}
