import java.util.*;

public class reverse_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        System.out.println("the reverse number is: ");
        while (num != 0) {
            int rem = num % 10;

            num = num / 10;
            System.out.print(rem);
        }
    }
}
