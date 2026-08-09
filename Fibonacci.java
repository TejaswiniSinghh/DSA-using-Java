import java.util.*;
public class Fibonacci
{
    static void solve( int n)
    {
        int a=1;
        int b=2;
        int c;
        System.out.print("0 ");
        System.out.print(a +" ");
        System.out.print(b+" ");
        for(int i=0; i<n-2; i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=  sc.nextInt();
        solve(n);
        sc.close();
    }
}