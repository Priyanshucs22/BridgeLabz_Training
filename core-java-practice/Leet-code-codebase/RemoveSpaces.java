public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "hello world java";
        String res = "";

        for (char c : s.toCharArray()) {
            if (c != ' ') res += c;
        }

        System.out.println(res);
    }
}
