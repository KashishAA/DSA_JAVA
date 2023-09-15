import java.util.*;

public class pattern18 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scn.nextInt();

        int sp = 0;
        int st = num;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= num / 2 && j > 1 && j < st) {
                    System.out.print("_\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= num / 2) {
                sp++;
                st -= 2;
            } else {
                st += 2;
                sp--;
            }
            System.out.println();
        }
    }

}
