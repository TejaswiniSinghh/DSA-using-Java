import java.util.*;
public class Count_Mnitor_RecordLow 
{
    static int count_record(int[] array )
    {
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int[] array= new int[x];
        for(int i=0; i<x; i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println(count_record(array));
        sc.close();
    }
}
