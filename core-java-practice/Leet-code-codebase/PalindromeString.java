public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        int l = 0, r = s.length() - 1;
        boolean ok = true;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                ok = false;
                break;
            }
            l++;
            r--;
        }

        System.out.println(ok);
    }
}
