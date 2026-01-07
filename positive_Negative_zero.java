import java.util.Scanner;
public class positive_Negative_zero 
{
    static void check(int a)
    {
        if( a> 0)
        {
            System.out.println("Positive");
        }
        else if( a<0)
        {
            System.out.println("Negative");
        }
        else System.out.println("zero");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a= sc.nextInt();
        check(a);
    }
}