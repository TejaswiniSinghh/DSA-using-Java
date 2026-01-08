import java.util.*;
public class HCF 
{
    static int cal(int a, int b)
    {
        int hcf=0;
        ArrayList<Integer> factors_a= new ArrayList<>();
        factors_a.add(a);
        ArrayList<Integer> factors_b= new ArrayList<>();
        factors_b.add(b);
        for(int i=1; i<=a/2; i++)
        {
            if(a%i==0)
            {
                factors_a.add(i);
            }
        }
        for(int j=1; j<=b/2; j++)
        {
            if(b%j==0)
            {
                factors_b.add(j);
            }
        }
        for( int i =0; i<factors_a.size(); i++  )
        {
            for( int j =0; j<factors_b.size(); j++  )
            {
                if (factors_a.get(i).equals(factors_b.get(j)))
                {
                    Integer common= factors_a.get(i);
                    if (hcf<common)
                    {
                        hcf=common;
                    }
                }
            }
        }
        return hcf;
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
