import java.util.*;
public class HCF 
{
    static int cal(int a, int b)
    {
        ArrayList<Integer> factors_a= new ArrayList<>();
        for(int i=1; i<=a/2; i++)
        {
            if(a%i==0)
            {
                factors_a.add(i);
                System.out.println(factors_a);
            }
        }
        return 1;

    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First num: ");
        int a = sc.nextInt();
        System.out.print("Enter Secound num: ");
        int b = sc.nextInt();
        System.out.println(cal(a,b));
        sc.close();

    }
}
