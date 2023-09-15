import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        int sp = num - 3;
        int st = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            if (i <= num / 2) {
                sp--;
                st += 2;
                System.out.println();
            } else {
                sp++;
                st -= 2;
                System.out.println();
            }
        }

    }
}
