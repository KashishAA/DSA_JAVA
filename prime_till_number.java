import java.util.*;

public class prime_till_number {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of input: ");
        int t = scn.nextInt();

        System.out.println("Enter the " + t + "numbers: ");
        int n;
        for (int i = 0; i < t; i++) {
            n = scn.nextInt();

            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0)
                    System.out.println("Not prime");
                else
                    System.out.println("prime");

            }
        }

    }
}