import java.util.*;
public class Reverse_String 
{
    static String reverse(String a)
    {
        String b= "";
        for (int i= a.length()-1; i>=0; i--)
        {
            b = b+ a.charAt(i);
        }
        return b;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(reverse(a));
        sc.close();


    }
}
