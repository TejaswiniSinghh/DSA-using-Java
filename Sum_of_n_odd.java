import java.util.*;
public class Sum_of_n_odd 
{
    static int sum(int n, int sum)
    {
        for (int i =1; i<=2*n ; i++)
        {
            if(i%2 != 0)
            {
                sum += i;
            }
        }
        return sum;

    }
    public static void main(String[] args)
    {
        
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(sum(n, sum));
    }
}
