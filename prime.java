import java.util.Scanner;public class prime 
{
    static void cal(int n)
    {
        if (n==1)
        {
            System.out.println("nor prime nor composite");
            
        }
        int count=0;
        for(int i=2; i<=n; i++)
        {
            for(int j=1; j<=i;j++)
            {
                int rem= i % j;
                if( rem==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        cal(n);
        sc.close();
    }
}
