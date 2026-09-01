import java.util.*;
public class Count_vowels 
{
    static int count(String a)
    {
        int num=0;
        for(int i=0; i<a.length(); i++)
        {
            
            if(a.charAt(i)=='a' || a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u')  num++;
        }
        return num;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("No. of vowels: " + count(a));
        sc.close();
    }
}
