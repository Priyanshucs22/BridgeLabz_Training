import java.util.*;
public class StringIndexOutDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // error
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        // generateException(text); // crash
        handleException(text);
    }
}