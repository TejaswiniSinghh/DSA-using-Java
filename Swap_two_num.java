import java.util.*;
public class Swap_two_num 
{
    static int[] swap( int a, int b)
    {
        int[] num = new int[2];
        a= a+b;
        b= a-b;
        a= a-b;
        num[0]=a;
        num[1]=b;
        return num;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int a= sc.nextInt();
        System.out.println("Enter second num:");
        int b= sc.nextInt();
        int[] result= swap(a,b);
        System.out.println("First num: "+result[0] );
        System.out.println("First num: "+result[1] );
    }
}
