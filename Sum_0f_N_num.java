import java.util.*;
public class Sum_0f_N_num 
{
    static int Sum(int n)
    {
        return n*(n+1)/2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        System.out.println("Sum of first n natural numbers: "+ Sum(n));
        sc.close();
    }
}
