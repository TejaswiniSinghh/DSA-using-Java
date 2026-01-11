import java.util.*;
public class Pattern_with_space 
{
    static void pattern(int n)
    {
        for(int i=0; i<=n; i++)
        {
            for(int s=1; s<=i; s++)
            {
                System.out.print(" ");
            }
            for( int k=0; k<n-i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    pattern(n);
    }
}
