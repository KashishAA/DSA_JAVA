import java.util.*;

public class SearchInSortedArray {
    public static void main(String[] args) {

        int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        int k = 32;
        int i = 0;
        int j = arr.length - 1;
        while (i < arr.length && j >= 0) {
            if (k == arr[i][j]) {
                System.out.print(i);
                System.out.print(j);
                return;
            } else if (k < arr[i][j]) {
                j--;

            } else {
                i++;
            }
        }
        System.out.print("Not Found");
    }

}
