import java.util.*;

public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        System.out.print("Enter the number of times you want to rotate: ");
        int k = scn.nextInt();
        int temp = num;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = num / div;
        int rem = num % div;
        int rot = rem * mul + q;
        System.out.print("the rotated number is: " + rot);

    }

}
