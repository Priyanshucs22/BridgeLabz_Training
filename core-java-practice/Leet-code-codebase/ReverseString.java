public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;

        while (l < r) {
            char t = c[l];
            c[l] = c[r];
            c[r] = t;
            l++;
            r--;
        }

        System.out.println(new String(c));
    }
}
