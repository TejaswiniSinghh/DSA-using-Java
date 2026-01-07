import java.util.*;
public class Sum_of_num_Array 
{
    static int sum(int list[])
    {
        int sum=0;
        for (int i=0; i<list.length; i++)
        {
            sum+=list[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length= sc.nextInt();
        int[] list= new int[length];
        System.out.println("Enter values for array:");
        for (int i=0; i<length; i++)
        {
            list[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Sum of values: "+ sum(list));
    }
}
