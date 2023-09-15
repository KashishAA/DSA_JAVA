public class comparison {
    public static void main(String[] args) {
        String s = "aaabbcccddaeef";

        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i++;
            }
            System.out.print(s.charAt(i));

        }
    }
}
