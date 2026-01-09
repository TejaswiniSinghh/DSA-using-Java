
import java.util.*;
public class Sum_of_digit_num 
{
    static int sum(int a)
    {
        int rem=0;
        int sum=0;
        while(a>0)
        {
            rem=a%10;
            sum+= rem;
            a=a/10;
        }
        return sum;

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:" );
        int a = sc.nextInt();
        System.out.println(sum(a));
    }
}
