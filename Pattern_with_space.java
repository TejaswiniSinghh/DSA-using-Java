import java.util.*;
public class Pattern_with_space 
{
    static void pattern(int n)
    {
        for(int i=n ; i<0; i--)
        {
            for(int j = i; j<n ;j--)
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
