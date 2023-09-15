import java.util.*;

public class DifferenceOfCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scn.next();
        System.out.println(solution(s));

    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char pre = s.charAt(i - 1);
            int diff = (curr - pre);
            sb.append(diff);
            sb.append(curr);

        }
        return sb.toString();

    }
}
