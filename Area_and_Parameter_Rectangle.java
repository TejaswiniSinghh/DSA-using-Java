import java.util.*;
public class Area_and_Parameter_Rectangle
{
    static long parameter(long a,long b)
    {
        return 2*(a+b);
    }
    static long area(long a,long b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        long a =sc.nextLong();
        System.out.println("Enter breath of rectangle:");
        long b =sc.nextLong();
        long res_para=parameter( a, b);
        System.out.println("para:"+ res_para);
        System.out.println("area:"+ area(a,b));
    }
}
