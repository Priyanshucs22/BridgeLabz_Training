public class StringLength {
    public static void main(String[] args) {
        String s = "computer";
        int cnt = 0;

        for (char _ : s.toCharArray()) cnt++;

        System.out.println(cnt);
    }
}
