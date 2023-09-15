import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        int sp = 0;
        int st = num;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();
        }

    }

}
