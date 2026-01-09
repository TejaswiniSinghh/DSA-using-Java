import java.util.*;
public class Formating_large_product 
{
    static void product(int a, int b)
    {
        int p=1, e=0,d=0;
        for(int i=0; (a+i)<b; i++)
        {
            p = p*(a+i);
        }
        p=p*b;
        while(p>0)
        {
            if(p%10==0)
            {
                e+=1;
                p=p/10;
                d=p;
            }
            else break;
        }
        System.out.println(d+" "+e);


    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        product(a,b);
    }
}
