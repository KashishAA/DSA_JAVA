public class palindromString {
    public static void main(String[] args) {
        String s = "abccbc";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                if (s.charAt(i) != s.charAt(j)) {
                    System.out.println("i:" + s.charAt(i));
                    System.out.println("j: " + s.charAt(j));
                    break;

                }
            }

        }
    }

}
