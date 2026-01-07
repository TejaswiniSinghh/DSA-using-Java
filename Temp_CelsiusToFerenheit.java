import java.util.*;
public class Temp_CelsiusToFerenheit 
{
    static double conversion( double temp_celsius)
    {
        return 32+(temp_celsius*9/5);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperatur n celsius:");
        double temp_celsius= sc.nextDouble();
        System.out.println("Temperatur in Ferenheit: "+ conversion(temp_celsius) );
        sc.close();
    }
}
