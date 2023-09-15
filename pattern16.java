import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();

        int sp = 2 * num - 3;
        int st = 1;

        for (int i = 1; i <= num; i++) {
            int val = 1;

            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == num) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }

            sp -= 2;
            st++;
            System.out.println();
        }
    }

}
