import java.util.*;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mul = num * i;
            System.out.println(num + " * " + i + " = " + mul);
        }
    }
}
