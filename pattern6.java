import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        int sp = 2;
        int st = 3;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            if (i <= num / 2) {
                sp += 2;
                st--;

            } else {

                sp -= 2;
                st++;

            }
            System.out.println();
        }
    }

}
