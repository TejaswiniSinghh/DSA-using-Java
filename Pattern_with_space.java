import java.util.*;
public class Pattern_with_space 
{
    static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for( int j=1; j<=n; j++)
            {
                if(i>=2)
                {
                    for( int k=1; k<i-1 ; k++)
                    {
                        System.out.print(" ");
                        j--;
                    }
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    pattern(n);
    }
}
