import java.util.*;
public class Left_rotation_array 
{
    static int[] rotations(int[] array, int d)
    {

        int temp=0;
        for(int i=0; i<array.length; i++)
        {
            if(d>0)
            {
                temp=array[0];
                array[i]=array[i+1];
                d--;
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
