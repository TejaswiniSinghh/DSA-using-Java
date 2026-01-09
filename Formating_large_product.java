import java.util.*;
public class Formating_large_product 
{
    static void product(int a, int b)
    {
        int p=1;
        for(int i=0; (a+i)<b; i++)
        {
            p = p*(a+i);
            System.out.println("      "+p);
        }
        p=p*b;
        System.out.println(p);


    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        product(a,b);
    }
}
