import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scn.nextInt();
        int sp = 2, st = 1;
        int count = 1;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            } /*
               * for (int j = 1; j <= 1; j++) {
               * System.out.print(i + "\t");
               * }
               */
            int value = count;
            for (int j = 1; j <= st; j++) {

                System.out.print(value + "\t");
                if (j <= st / 2) {
                    value++;
                } else {
                    value--;
                }
            }

            if (i <= num / 2) {
                count++;
                sp--;
                st += 2;

            } else {
                count--;
                sp++;
                st -= 2;
            }

            System.out.println();
        }
    }
}
