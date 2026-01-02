import java.util.*;
public class DynamicInput_calculator 
{

    static int add( int a, int b)
    {
        return a+b;
    }
    static int sub( int a, int b)
    {
        return a-b;
    }
    static int prod(int a, int b)
    {

        if( a==0 || b == 0)
        {
            return 0;
        }
        else
        {
            return a*b;
        }
    }
    static int div( int a, int b)
    {
        if( b == 0)
        {
            System.out.println("Invalid choice of b dor division");
            return 0;
        }
        else
        {
            return a/b;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        /*int addition =add(a, b);
        int Subtraction =sub(a, b);
        int Product =prod(a, b);
        int Division =div(a, b);*/
        System.out.println(add(a, b) +"\n"+ sub(a, b) +"\n"+ div(a, b) +"\n"+ prod(a, b));
        //System.out.println("Addition =" +addition +" Substraction = " +Subtraction +" Product = "+Product +"Division = "+Division); 
    }
}
