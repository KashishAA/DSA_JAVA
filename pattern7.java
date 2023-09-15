import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = scn.nextInt();

        int sp1 = 0;
        int sp2 = 4;
        int st = 1;
        /*
         * for (int i = 1; i <= num; i++) {
         * for (int j = 1; j <= sp1; j++) {
         * System.out.print("\t");
         * }
         * for (int j = 1; j <= st; j++) {
         * System.out.print("*\t");
         * }
         * for (int j = 1; j <= sp2; j++) {
         * System.out.print("\t");
         * 
         * }
         * 
         * sp1++;
         * sp2--;
         * System.out.println();
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j) {
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");

                }
            }
            System.out.println();
        }
    }

}
