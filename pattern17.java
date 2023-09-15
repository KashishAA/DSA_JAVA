import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scn.nextInt();

        int sp = num / 2;
        int st = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == num / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= num / 2 ) {
                st++;
            } else {
                st--;
            }
            System.out.println();
        }
    }

}
