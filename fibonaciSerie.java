import java.util.*;

public class fibonaciSerie {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = scn.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }

    }
}