import java.util.*;
public class LowercaseConverter {
    public static String toLowercaseCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String custom = toLowercaseCustom(text);
        String builtin = text.toLowerCase();
        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtin);
        System.out.println("Are Equal: " + compare(custom, builtin));
    }
}
