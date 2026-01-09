import java.util.*;
public class Swap_first_last_num 
{
    static long swap( long a)
    {
        ArrayList<Long> number= new ArrayList<>();
        while(a>0)
        {
            long rem= a%10;
            number.add(rem);
            a=a/10;
        }
        long first=number.get(0);
        long last= number.get(number.size()-1);
        number.set(0, last);
        number.set(number.size()-1, first);
        long num=0;
        for(int i=number.size()-1; i>=0; i--)
        {
            num=num*10 + number.get(i);
        }
        return num;
    }
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long a = sc.nextLong();
        System.out.println(swap(a));
        sc.close();

    }
}
