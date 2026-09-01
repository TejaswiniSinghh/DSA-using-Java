import java.util.*;
public class MAX_in_array 
{
    static int max(int[] arr)
    {
        int maximum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(maximum> arr[i])  maximum=arr[i];
        }
        return maximum;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<size; i++)
        {
             arr[i]= sc.nextInt();
        }
        System.out.println(" Max is: "+ max(arr));
    }
}
