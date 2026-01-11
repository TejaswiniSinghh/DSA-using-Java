import java.util.*;
public class Trapezium_printing 
{
    static void pattern(int n)
    {
        char x='.';
        for(int i=0; i<=n; i++)
        {
            if(i==(2*n+1)/2)
            {
                System.out.println(x*i);
            }
            System.out.println(x*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}
