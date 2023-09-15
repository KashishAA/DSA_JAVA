import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        /*
         * char s = 'p';
         * int ascii = s;
         * if (ascii >= 97) {
         * int a = ascii - 32;
         * System.out.println(a);
         * char c = (char) a;
         * System.out.println(c);
         * 
         * }
         * 
         */
        String s = "pEpCOdiNG";
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 >= 'a' && c1 <= 'z') {
                int up = c1 - 32;
                char c = (char) up;
                System.out.print(c);
            } else {
                int lo = c1 + 32;
                char c = (char) lo;
                System.out.print(c);
            }

        }
    }
}
