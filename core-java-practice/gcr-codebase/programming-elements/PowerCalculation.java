import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double exp = sc.nextDouble();

        double result = Math.pow(base, exp);
        System.out.println(result);
        sc.close();
    }
}
