import java.util.*;

public class pallindrome 
{
    static boolean check(int num)
    {
        int rem,rev=0;
        int temp= num;
        while(temp>0)
        {
            rem= num%10;
            temp=temp/10;
            rev= (rev*10)+ rem;

        }
        if(num== rev)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(check(num))
        {
            System.out.println("PALLINDROME");
        }
        else System.out.println("NOT PALLINDROME");
    }
}
