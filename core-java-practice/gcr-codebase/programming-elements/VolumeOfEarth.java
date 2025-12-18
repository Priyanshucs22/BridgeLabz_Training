import java.util.*;
public class VolumeOfEarth {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int radius=sc.nextInt();
        double pi = 3.14;
        double volInCubicMetre = (4.0/3) * pi * radius * radius * radius;
        double volInCubicMiles=volInCubicMetre*1.6*1.6*1.6;
        System.out.printf("Volume of Earth in cubic metres "+volInCubicMetre+" and in cubic miles "+ volInCubicMiles);
        sc.close();
    }
}
