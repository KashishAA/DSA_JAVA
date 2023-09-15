import java.util.*;

public class find_Element {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int a = scn.nextInt();

        int[] arr = new int[a];
        System.out.print("Enter the values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the number you want to search: ");
        int d = scn.nextInt();
        findElement(arr, d);
    }

    public static void findElement(int arr[], int d) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
                index = i;
                break;

            }
        }
        System.out.println("It is found at:" + index);
    }
}
