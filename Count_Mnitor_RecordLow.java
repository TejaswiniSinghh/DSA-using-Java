import java.util.*;
public class Count_Mnitor_RecordLow 
{
    static int count_record(int[] array )
    {
        int min= 100000;
        int change=0;
        for(int i=0; i<array.length; i++ )
        {
            if(min>array[i])
            {
                min= array[i];
                change++;
            }
        }
        return change;
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
