import java.util.*;

public class Inverse_digit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scn.nextInt();

        int inv = 0;
        int op = 1;
        while (number != 0) {
            int od = number % 10;
            int id = op;
            int ip = od;
            inv = inv + id * (int) Math.pow(10, ip - 1);
            number = number / 10;
            op++;

        }
        System.out.println("The inverse digit is: ");
        System.out.println(inv);
    }
}
