import java.util.*;
public class Calculate_SI 
{
    static double simpleInterest ( double principle, double rate, int year)
    {
        return principle*rate*year/100;
    }
    static double compoundInterest ( double principle, double rate, int year)
    {
        double CI= principle *Math.pow((1+ rate/100), year);
        return CI- principle;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        double principle= sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double rate= sc.nextDouble();
        System.out.println("Enter year");
        int year= sc.nextInt();
        System.out.println("Simple Interest: "+ simpleInterest(principle, rate, year) );
        System.out.println("Compound Interest: "+ compoundInterest(principle, rate, year) );
        sc.close();
    }
}
