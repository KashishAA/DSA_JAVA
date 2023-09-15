import java.util.*;

public class remove_prime_numFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());

        }
        solution(list);
        System.out.print(list);
    }

    public static void solution(ArrayList<Integer> list) {

        for (int j = list.size() - 1; j >= 0; j--) {
            int val = list.get(j);
            if (isPrime(val) == true) {
                list.remove(j);
            }

        }
    }

    public static boolean isPrime(int val) {
        for (int div = 2; div * div <= val; div++) {
            if (val % div == 0) {
                return false;
            }
        }
    }

}
