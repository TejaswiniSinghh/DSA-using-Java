import java.util.*;
public class AreaAndCircumference_Circle
{
    static double area(double radius)
    {
       double area= Math.PI*radius*radius;
       return area;

    }
    static double circumference(double radius)
    {
       double cir= Math.PI*(2*radius);
       return cir;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double r =sc.nextDouble();
        System.out.println("Area of circle: "+ area(r) + "\ncircumference of circle: " + circumference(r));
        sc.close();
    }
}