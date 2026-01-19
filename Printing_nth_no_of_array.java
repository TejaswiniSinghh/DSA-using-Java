import java.util.*;
public class Printing_nth_no_of_array
{
    static void Printing(int n, int[] arr)
    {
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i]= sc.nextInt();
        }
        int n = sc.nextInt();
        Printing(n, arr);
    }
}