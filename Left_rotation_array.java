import java.util.*;
public class Left_rotation_array 
{
    static int[] rotations(int[] array, int d)
    {

        int temp;
        d=d%array.length;
        for(int i=0; i<d; i++)
        {
            temp=array[0];
            for(int j=0;j<array.length-1; j++)
            {
                array[j]=array[j+1];
            }
            array[array.length-1]=temp;
        }
        return array;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        int[] array= new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int[] result=rotations(array, d );
        for(int x: result)
        {
            System.out.print( x+" ");
        }    
        
        sc.close();
    }
}
