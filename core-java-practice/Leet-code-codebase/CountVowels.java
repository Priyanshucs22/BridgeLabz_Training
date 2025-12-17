public class CountVowels {
    public static void main(String[] args) {
        String s = "education";
        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                cnt++;
        }

        System.out.println(cnt);
    }
}
