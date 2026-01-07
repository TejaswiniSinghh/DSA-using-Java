import java.util.Scanner;
public class Even_odd 
{
    static boolean check(int a)
    {
        if( a==0)
        {
            return false;
        }
        if (a%2 == 0)
        {
            return true;
        }
        
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int a = sc.nextInt();
        System.out.println(check(a));
        sc.close();
    }
}
