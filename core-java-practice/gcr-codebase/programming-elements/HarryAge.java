import java.util.*;
public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BirthAge = sc.nextInt();
        int CurAge=2024 - BirthAge;
        System.out.println("Harry's age in 2024 is"+CurAge);
        sc.close();
    }
}