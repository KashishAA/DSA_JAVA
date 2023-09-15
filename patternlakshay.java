import java.util.*;

public class patternlakshay {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int nst = 1, nsp = 2;

        for (int i = 1; i <= n; i++) {

            for (int csp = 1; csp <= nsp; csp++) {
                if (i != n / 2 + 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (i < n / 2 + 1) {
                nst++;
            } else {
                nst--;
            }
            System.out.println();
        }
    }
}
