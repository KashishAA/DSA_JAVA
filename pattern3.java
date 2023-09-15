import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        int space = num - 1;
        int star = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            space--;
            star++;
            System.out.println();
        }

    }
}
